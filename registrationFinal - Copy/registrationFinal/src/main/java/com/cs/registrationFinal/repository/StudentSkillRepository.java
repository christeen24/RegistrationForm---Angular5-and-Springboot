package com.cs.registrationFinal.repository;

import com.cs.registrationFinal.model.StudentSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Christeen on 10/2/2018.
 */
@Repository
public interface StudentSkillRepository extends JpaRepository<StudentSkill, Integer> {

}
