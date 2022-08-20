package com.heberian.spring.data.jpa.workouts.repository;

import com.heberian.spring.data.jpa.workouts.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
