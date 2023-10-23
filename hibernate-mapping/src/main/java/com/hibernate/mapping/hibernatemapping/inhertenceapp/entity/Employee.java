package com.hibernate.mapping.hibernatemapping.inhertenceapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.ToString;


@Entity
@ToString
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Employee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int age;


    protected Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
