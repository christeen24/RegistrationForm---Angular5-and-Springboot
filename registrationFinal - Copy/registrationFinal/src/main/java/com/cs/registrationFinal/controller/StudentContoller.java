package com.cs.registrationFinal.controller;

import com.cs.registrationFinal.DTO.StudentDTO;
import com.cs.registrationFinal.model.Student;
import com.cs.registrationFinal.model.StudentSkill;
import com.cs.registrationFinal.service.StudentService;
import com.cs.registrationFinal.service.StudentServiceImpl;
import com.cs.registrationFinal.service.StudentSkillImpl;
import com.cs.registrationFinal.service.StudentSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cs.registrationFinal.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Christeen on 10/1/2018.
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class  StudentContoller {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private StudentService studentService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private StudentSkillService studentSkillService;

    @PostMapping("/student")
    public Student create(@RequestBody StudentDTO student) {

        Student student1 = new Student();
        student1.setStd_id(student.getStd_id());
        student1.setFname(student.getFname());
        student1.setLname(student.getLname());
        student1.setEmail(student.getEmail());
        studentService.create(student1);

        for(String studentSkill : student.getStudentskill()){
            StudentSkill studentSkill1 = new StudentSkill();
            studentSkill1.setStudent(student1);
            studentSkill1.setSkill_name(studentSkill);
            studentSkillService.create(studentSkill1);
        }

        return null;
    }
    //
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
    //    @GetMapping(path = {"/{id}"})
//    public Student findOne(@PathVariable("id") int id) {
//        return studentService.findById(id);
//    }
//
//    @PutMapping
//    public Student update(@RequestBody Student student) {
//        return studentService.update(student);
//    }
//
//    @DeleteMapping("/students/{id}")
//    public Student delete(@PathVariable int id) {
//
//        return studentService.delete(id);
//    }

    @GetMapping("/students")
    public List findAll() {

        return studentService.findAll();
    }
}
