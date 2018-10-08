package com.cs.registrationFinal.service;

import com.cs.registrationFinal.model.StudentSkill;

import java.util.List;

/**
 * Created by Christeen on 10/2/2018.
 */
public interface StudentSkillService {
    List findAll();

    void create(StudentSkill studentSkill1);
}
