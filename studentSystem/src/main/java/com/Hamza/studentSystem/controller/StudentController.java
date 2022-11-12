package com.Hamza.studentSystem.controller;

import com.Hamza.studentSystem.model.Student;
import com.Hamza.studentSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student)
    {
        studentService.saveStudent(student);
        return "New Student Added";
    }
    @GetMapping("/getAll")
    public List<Student> getAll()
    {
        return studentService.getAllStudents();
    }

    @GetMapping("/getById/{Id}")
    public Optional<Student> getById(@PathVariable Integer Id)
    {
        return studentService.getStudentById(Id);
    }

    @GetMapping("/getByName/{name}")
    public Optional<Student> getByName(@PathVariable String name)
    {
        return studentService.getStudentByName(name);
    }
    @GetMapping("/delete/{Id}")
    public void deleteById(@PathVariable Integer Id)
    {
        studentService.deleteStudentById(Id);
    }


}
