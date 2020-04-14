package com.fediuchenko.uni.dao;

import com.fediuchenko.uni.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
