package com.fediuchenko.uni.controller;

import com.fediuchenko.uni.model.StudentEntity;
import com.fediuchenko.uni.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/students")
    @ResponseBody
    public List<StudentEntity> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    @ResponseBody
    public StudentEntity getStudentById(@PathVariable(name = "id") String id){
        return studentService.getStudentById(Integer.parseInt(id));
    }
}
