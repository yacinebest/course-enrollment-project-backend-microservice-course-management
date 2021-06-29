package com.besttocode.microservicecoursemanagement.service;

import com.besttocode.microservicecoursemanagement.model.Course;
import com.besttocode.microservicecoursemanagement.model.Transaction;
import com.besttocode.microservicecoursemanagement.repository.CourseRepository;
import com.besttocode.microservicecoursemanagement.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{


    private CourseRepository courseRepository;
    private TransactionRepository transactionRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository, TransactionRepository transactionRepository) {
        this.courseRepository = courseRepository;
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<Course> allCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course findCourseById(Long courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }

    @Override
    public List<Transaction> findTransactionsOfUser(Long userId) {
        return transactionRepository.findAllByUserId(userId);
    }

    @Override
    public List<Transaction> findTransactionsOfCourse(Long courseId) {
        return transactionRepository.findAllByCourseId(courseId);
    }

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
