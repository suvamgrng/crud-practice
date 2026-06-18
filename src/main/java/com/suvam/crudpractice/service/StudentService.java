package com.suvam.crudpractice.service;

import com.suvam.crudpractice.model.Student;
import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Getter
public class StudentService {

    public List<Student> students = new ArrayList<>(List.of(
            new Student(
                    1,
                    "Suvam Gurung",
                    19,
                    "suvam123@gmail.com"
            ),
            new Student(
                    2,
                    "Amisha Gurung",
                    18,
                    "amisha123@gmail.com"
            ),
            new Student(
                    1,
                    "Samir Gurung",
                    18,
                    "samir123@gmail.com"
            )
    ));

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student updateStudent(long id, Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                student.setId(id);
                students.set(i, student);
                return student;
            }
        }
        return null;
    }
}
