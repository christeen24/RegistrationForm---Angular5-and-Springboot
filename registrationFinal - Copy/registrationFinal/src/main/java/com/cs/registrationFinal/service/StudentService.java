package com.cs.registrationFinal.service;

import com.cs.registrationFinal.model.Student;

import java.util.List;
import java.util.Optional;

/**
 * Created by Christeen on 10/1/2018.
 */
public interface StudentService {
    Student create(Student student);

//    Student findById(int id);

    Student update(Student student);

//    Student delete(int id);

    List findAll();
}
