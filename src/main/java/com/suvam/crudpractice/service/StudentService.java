package com.suvam.crudpractice.service;

import com.suvam.crudpractice.model.Student;
import com.suvam.crudpractice.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {

    StudentRepo repo;

    public List<Student> getStudents() {
        return repo.findAll();
    }

    public void addStudent(Student student) {
        repo.save(student);
    }

    public Student updateStudent(long id, Student student) {
        student.setId(id);
        return repo.save(student);
    }

    public Student deleteStudent(long id) {
        Student student = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("No student found"));
        repo.delete(student);
        return student;
    }
}