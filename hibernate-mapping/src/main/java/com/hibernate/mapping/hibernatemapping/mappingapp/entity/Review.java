package com.hibernate.mapping.hibernatemapping.mappingapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Review {
    @Id
    @GeneratedValue
    private Long id;

    private String description;

    private int rating;

    @ManyToOne
    private Course course;



    public Review(String description, int rating) {
        this.description = description;
        this.rating = rating;
    }
    public Review(){}
}
