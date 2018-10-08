package com.cs.registrationFinal.service;

import com.cs.registrationFinal.repository.StudentSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cs.registrationFinal.model.StudentSkill;
import java.util.List;

/**
 * Created by Christeen on 10/2/2018.
 */
@Service
public class StudentSkillImpl implements StudentSkillService{
    @Autowired
    private StudentSkillRepository repository;

    @Override
    public List findAll() {

        return (List) repository.findAll();
    }

    @Override
    public void create(StudentSkill studentSkill1) {

    }


}
