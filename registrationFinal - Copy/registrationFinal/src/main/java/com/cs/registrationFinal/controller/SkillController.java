package com.cs.registrationFinal.controller;

import com.cs.registrationFinal.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Christeen on 10/2/2018.
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class SkillController {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private SkillService skillService;

    @GetMapping("/skills")
    public List findAll() {

        return skillService.findAll();
    }
}
