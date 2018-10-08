package com.cs.registrationFinal.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by Christeen on 10/1/2018.
 */
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "fname")
    @Size(min = 3, max = 100)
    private String fname;

    @Column(name = "lname")
    @Size(min = 3, max = 100)
    private String lname;

    @Column(name = "email")
    @Size(min = 3, max = 100)
    private String email;

    @JsonManagedReference
    @OneToMany(mappedBy = "student" , cascade = CascadeType.ALL)
//    @JoinColumn(name = "id", referencedColumnName = "student_id")
    private List<StudentSkill> studentskill;

    public List<StudentSkill> getStudentSkills() {
        return studentskill;
    }

    public void setStudentSkills(List<StudentSkill> studentSkills) {
        this.studentskill = studentSkills;
    }

    public Student() {
    }

    public int getStd_id() {
        return id;
    }

    public void setStd_id(int std_id) {
        this.id = std_id;
    }

    public String getFname() {

        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {

        return lname;
    }

    public void setLname(String lname) {

        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
