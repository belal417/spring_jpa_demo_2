package com.hibernate.mapping.hibernatemapping.mappingapp.service;


import com.hibernate.mapping.hibernatemapping.mappingapp.entity.Course;
import com.hibernate.mapping.hibernatemapping.mappingapp.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseStudentRepository {

    @PersistenceContext
    EntityManager entityManager;


    public void addStudentCourses(){

        Student student1 = new Student();
        student1.setName("Poorna");

        Student student2 = new Student();
        student2.setName("Ajitesh");

        Course course1 = new Course();
        course1.setName("Learn Scrum Master");

        Course course2 = new Course();
        course2.setName("Learn Agile Model");

        Course course3 = new Course();
        course3.setName("Managers Course");

        student1.setCourses(course1);
        student1.setCourses(course2);

        student2.setCourses(course2);
        student2.setCourses(course3);

        course1.addStudent(student1);
        course2.addStudent(student1);
        course2.addStudent(student2);
        course3.addStudent(student2);

        entityManager.persist(student1);
        entityManager.persist(student2);
        entityManager.persist(course1);
        entityManager.persist(course2);
        entityManager.persist(course3);


    }

    public void addCoursesStudent(){}
}
