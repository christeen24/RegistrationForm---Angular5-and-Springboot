package com.cs.registrationFinal.DTO;

/**
 * Created by Christeen on 10/5/2018.
 */
public class StudentDTO {
    private int id;
    private String fname;
    private String lname;
    private String email;
    private String [] studentskill;
    public StudentDTO() {
    }

    public String[] getStudentskill() {
        return studentskill;
    }

    public void setStudentskill(String[] studentskill) {
        this.studentskill = studentskill;
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

