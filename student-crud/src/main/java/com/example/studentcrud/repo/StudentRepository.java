package com.example.studentcrud.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.studentcrud.beans.Student;
import java.util.List;


public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByNameContainingIgnoreCase(String partialName);
    List<Student> findByEmailContainingIgnoreCase(String partialEmail);
}