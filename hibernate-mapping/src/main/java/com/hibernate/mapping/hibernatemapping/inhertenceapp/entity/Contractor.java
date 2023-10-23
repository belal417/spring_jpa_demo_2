package com.hibernate.mapping.hibernatemapping.inhertenceapp.entity;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Contractor extends Employee{

    private double payment;

    public Contractor(String name, int age, double payment) {
        super(name, age);
        this.payment = payment;
    }
}
