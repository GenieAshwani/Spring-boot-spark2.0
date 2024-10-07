package com.genie.JPA_Project01.controller;

import com.genie.JPA_Project01.entity.Student;
import com.genie.JPA_Project01.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/std")
public class StudentController {

    @Autowired
    private StudentService service;


    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student)
    {
        return service.saveStudent(student);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents()
    {
        List<Student> allStudentData = service.getAllStudentData();
        return allStudentData;
    }

    @GetMapping
    public Student getStudentById(@RequestParam Integer id,@RequestParam String name)
    {
        return service.getStudentById(id);
    }


    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Integer id,@RequestBody Student student)
    {
        Student updatedStudent = service.updateStudent(id, student);
        return updatedStudent;
    }


}
