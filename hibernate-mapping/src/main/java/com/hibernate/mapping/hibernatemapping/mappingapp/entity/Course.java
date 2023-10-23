package com.hibernate.mapping.hibernatemapping.mappingapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Course {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "course")   //one course can have many reviews
    private List<Review> reviews = new ArrayList<>();

    @ManyToMany
    private List<Student> students = new ArrayList<>();

    public Course(String name, List<Review> reviews) {
        this.name = name;
        this.reviews = reviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addReview(Review reviews) {
        this.reviews.add(reviews) ;
    }

    public void removeReview(Review reviews) {
        this.reviews.remove(reviews) ;
    }

    public void addStudent(Student student) {
        this.students.add(student) ;
    }

    public void removeStudent(Student student) {
        this.students.remove(student) ;
    }
}
