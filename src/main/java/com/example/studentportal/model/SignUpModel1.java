package com.example.studentportal.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "student")
public class SignUpModel1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String dept;

    private String studentID;

    @Column(name = "Passcode")
    @Size(min = 6,max = 8)
    private String pass;

    public SignUpModel1() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
