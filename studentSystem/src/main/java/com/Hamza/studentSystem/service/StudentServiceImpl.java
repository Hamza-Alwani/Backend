package com.Hamza.studentSystem.service;

import com.Hamza.studentSystem.model.Student;
import com.Hamza.studentSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);

    }

    @Override
    public Optional<Student> getStudentByName(String name) {
        return   studentRepository.getByName(name);

    }
}
