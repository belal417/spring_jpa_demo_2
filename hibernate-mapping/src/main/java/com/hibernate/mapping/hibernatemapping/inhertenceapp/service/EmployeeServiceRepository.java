package com.hibernate.mapping.hibernatemapping.inhertenceapp.service;


import ch.qos.logback.core.model.conditional.ElseModel;
import com.hibernate.mapping.hibernatemapping.inhertenceapp.entity.Contractor;
import com.hibernate.mapping.hibernatemapping.inhertenceapp.entity.Employee;
import com.hibernate.mapping.hibernatemapping.inhertenceapp.entity.FullTimeEmployee;
import com.hibernate.mapping.hibernatemapping.inhertenceapp.entity.PartTimeEmployee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EmployeeServiceRepository {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager entityManager;
    public void addAndDisplayEmployees(){
        logger.info("inside addAndDisplayEmployees function");

        Employee employee1 = new Contractor("Belal",27,35000.00);
        Employee employee2 = new FullTimeEmployee("Poorna",30,90000.00);
        Employee employee3 = new PartTimeEmployee("Praveen",29,65000.00);

        entityManager.persist(employee1);
        entityManager.persist(employee2);
        entityManager.persist(employee3);

        List<Employee> getAllEmployeeList = entityManager.createQuery("Select e from Employee e", Employee.class).getResultList();
        logger.info("list of all employees {}",getAllEmployeeList);



    }

}
