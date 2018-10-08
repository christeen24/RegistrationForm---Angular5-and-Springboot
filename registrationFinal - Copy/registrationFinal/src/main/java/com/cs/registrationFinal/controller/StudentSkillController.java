package com.cs.registrationFinal.controller;

import com.cs.registrationFinal.model.StudentSkill;
import com.cs.registrationFinal.service.StudentSkillImpl;
import com.cs.registrationFinal.service.StudentSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Christeen on 10/2/2018.
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class StudentSkillController {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private StudentSkillService studentSkillService;

    @GetMapping("/stdskills")
    public List findAll() {

        return studentSkillService.findAll();
    }

}
