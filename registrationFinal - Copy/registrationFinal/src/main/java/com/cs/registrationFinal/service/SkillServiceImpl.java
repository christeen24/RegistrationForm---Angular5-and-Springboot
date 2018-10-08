package com.cs.registrationFinal.service;

import com.cs.registrationFinal.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cs.registrationFinal.model.Skill;

import java.util.List;

/**
 * Created by Christeen on 10/2/2018.
 */
@Service
public class SkillServiceImpl implements SkillService{
    @Autowired
    private SkillRepository repository;

    @Override
    public List findAll() {

        return (List) repository.findAll();
    }
}
