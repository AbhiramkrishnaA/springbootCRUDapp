package com.sample.springbootdemo.model;

import jakarta.persistence.*;

@Entity
@Table(name="student_detials")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "std_id")
    private Integer student_Id;
    private String student_Name;
    private Integer student_Age;
    private String student_Place;


    public StudentModel(Integer student_Id, String student_Name, Integer student_Age, String student_Place) {
        this.student_Id = student_Id;
        this.student_Name = student_Name;
        this.student_Age = student_Age;
        this.student_Place = student_Place;
    }

    public Integer getStudent_Id() {
        return student_Id;
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public Integer getStudent_Age() {
        return student_Age;
    }

    public String getStudent_Place() {
        return student_Place;
    }

    public void setStudent_Id(Integer student_Id) {
        this.student_Id = student_Id;
    }

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public void setStudent_Age(Integer student_Age) {
        this.student_Age = student_Age;
    }

    public void setStudent_Place(String student_Place) {
        this.student_Place = student_Place;
    }

    @Override
    public String toString() {
        return "student_class{" +
                "student_Id=" + student_Id +
                ", student_Name='" + student_Name + '\'' +
                ", student_Age=" + student_Age +
                ", student_Place='" + student_Place + '\'' +
                '}';
    }

}


