package com.fediuchenko.uni.dao;

import com.fediuchenko.uni.model.EnrollmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EnrollmentRepository extends JpaRepository<EnrollmentEntity, Integer> {

}
