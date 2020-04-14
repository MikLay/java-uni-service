package com.fediuchenko.uni.service;

import com.fediuchenko.uni.model.StudentEntity;

import java.util.List;

public interface StudentService {
    StudentEntity createStudent(StudentEntity studentEntity);
    StudentEntity getStudentById(Integer id);
    List<StudentEntity> getAllStudents();
}
