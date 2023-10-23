package com.hibernate.mapping.hibernatemapping.mappingapp.service;


import com.hibernate.mapping.hibernatemapping.mappingapp.entity.Course;
import com.hibernate.mapping.hibernatemapping.mappingapp.entity.Review;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseReviewRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    EntityManager entityManager;
    public void addReviewsTOCourse(){

        Review review1 = new Review("very easy to understand",5);
        Review review2 = new Review("fantastic",5);

        Course course1 = new Course();
        course1.setName("Learn English in 10 days");
        course1.addReview(review1);
        course1.addReview(review2);

        review1.setCourse(course1);
        review2.setCourse(course1);

        entityManager.persist(review1);
        entityManager.persist(review2);
        entityManager.persist(course1);


    }

}
