package com.cs.registrationFinal.repository;

import com.cs.registrationFinal.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Christeen on 10/1/2018.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
