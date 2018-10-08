package com.cs.registrationFinal.service;

import com.cs.registrationFinal.repository.StudentRepository;
import com.cs.registrationFinal.repository.StudentSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import com.cs.registrationFinal.model.Student;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository repository;

    @Override
    public Student create(Student student) {

        return repository.save(student);
    }

//    public Student delete(int id) {
//        Student student = findById(id);
//        if(student != null){
//            repository.delete(student);
//        }
//        return student;
//    }

//    @Override
//    public ResponseEntity<?> delete(@PathVariable int id) {
//        return repository.findById(id)
//                .map(student -> {
//                    List<Integer> skillIds = repository1.getIdByStdId(id);
//                    for (Integer id1: skillIds) {
//                        repository1.deleteById(id1);
//                    }
//                    repository.delete(student);
//                    return ResponseEntity.ok().build();
//                }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + id));
//    }

    @Override
    public List<Student> findAll() {

        return repository.findAll();
    }


//    public Student findById(int id) {
//
//        return repository.findById(id);
//    }

    @Override
    public Student update(Student student) {

        return null;
    }
}
