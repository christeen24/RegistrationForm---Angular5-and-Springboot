package com.cs.registrationFinal.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by Christeen on 10/2/2018.
 */
@Entity
@Table(name = "student_skill")
public class StudentSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ss_id")
    private int ss_id;

    @Column(name = "skill_name")
//    @Size(min = 3, max = 100)
    private String skill_name;

//    private int id;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

//    @Column(name = "student_id")
//    @Size(min = 3, max = 100)
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER , optional = false)
    @JoinColumn(name = "student_id" , nullable = false, referencedColumnName = "id")
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }



    //    public int getStudent_id() {
//        return student_id;
//    }
//
//    public void setStudent_id(int student_id) {
//        this.student_id = student_id;
//    }

//    private int id;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public StudentSkill() {
    }

    public int getSs_id() {
        return ss_id;
    }

    public void setSs_id(int ss_id) {
        this.ss_id = ss_id;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    public void create(StudentSkill studentSkill1) {
    }
}
