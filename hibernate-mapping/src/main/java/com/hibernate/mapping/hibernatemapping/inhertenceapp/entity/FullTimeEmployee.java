package com.hibernate.mapping.hibernatemapping.inhertenceapp.entity;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class FullTimeEmployee extends Employee{

    private double salary;

    public FullTimeEmployee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
}
