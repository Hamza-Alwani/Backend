package com.Hamza.studentSystem.service;

import com.Hamza.studentSystem.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

    public Optional<Student> getStudentById(int id);

    public Optional<Student> getStudentByName(String name);

    public void deleteStudentById(int id);
}
