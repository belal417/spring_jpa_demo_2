package com.hibernate.mapping.hibernatemapping.mappingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses = new ArrayList<>();

    public Student(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourses(Course courses) {
        this.courses.add(courses);
    }

    public void removeCourses(Course courses) {
        this.courses.remove(courses);
    }
}
