package com.studentms.studentms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.studentms.studentms.dto.StudentDTO;
import com.studentms.studentms.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudents")
    public List<StudentDTO> getStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/saveStudent") //add student
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.saveStudent(studentDTO);
    }

    @PutMapping("/updateStudent")
    public StudentDTO updateStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.updateStudent(studentDTO);
    }

    @DeleteMapping("/deleteStudent")
    public boolean deleteStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.deleteStudent(studentDTO);
    }
}
