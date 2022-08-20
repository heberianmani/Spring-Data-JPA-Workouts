package com.heberian.spring.data.jpa.workouts.repository;

import com.heberian.spring.data.jpa.workouts.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository <CourseMaterial, Long>{
}
