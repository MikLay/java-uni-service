package com.fediuchenko.uni.service.impl;

import com.fediuchenko.uni.model.StudentEntity;
import com.fediuchenko.uni.dao.StudentRepository;
import com.fediuchenko.uni.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public StudentEntity createStudent(StudentEntity studentEntity) {
        return studentRepository.saveAndFlush(studentEntity);
    }

    @Override
    public StudentEntity getStudentById(Integer id) {
        Optional<StudentEntity> studentOptional = studentRepository.findById(id);
        return studentOptional.orElse(null);
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}
