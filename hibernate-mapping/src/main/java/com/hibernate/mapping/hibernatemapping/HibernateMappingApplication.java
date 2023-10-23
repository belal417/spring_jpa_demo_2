package com.hibernate.mapping.hibernatemapping;

import com.hibernate.mapping.hibernatemapping.inhertenceapp.service.EmployeeServiceRepository;
import com.hibernate.mapping.hibernatemapping.mappingapp.service.CourseReviewRepository;
import com.hibernate.mapping.hibernatemapping.mappingapp.service.CourseStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateMappingApplication implements CommandLineRunner {

	@Autowired
	CourseReviewRepository courseReviewRepository;
	@Autowired
	CourseStudentRepository courseStudentRepository;
	@Autowired
	EmployeeServiceRepository	employeeServiceRepository;
	public static void main(String[] args) {
		SpringApplication.run(HibernateMappingApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		//courseReviewRepository.addReviewsTOCourse();
		//courseStudentRepository.addStudentCourses();
		employeeServiceRepository.addAndDisplayEmployees();
	}
}
