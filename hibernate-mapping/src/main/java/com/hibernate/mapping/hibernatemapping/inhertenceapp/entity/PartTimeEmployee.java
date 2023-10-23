package com.hibernate.mapping.hibernatemapping.inhertenceapp.entity;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class PartTimeEmployee extends Employee{

    private double payment;

    public PartTimeEmployee(String name, int age, double payment) {
        super(name, age);
        this.payment = payment;
    }
}
