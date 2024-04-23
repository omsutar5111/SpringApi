package com.practice.scaler_students.Controller;

import com.practice.scaler_students.Model.Students;
import com.practice.scaler_students.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Students> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<Students> getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public String createStudent(@RequestBody Students student) {
        Students savedStudent=studentService.createStudent(student);
        if(null!=savedStudent){
           return "Student saved Successfully with id "+savedStudent.getId() ;
        }
        return  "student not saved";


    }

    @PutMapping("/{id}")
    public Students updateStudent(@PathVariable Long id, @RequestBody Students updatedStudent) {
        return studentService.updateStudent(id, updatedStudent);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "Student with id"+id+"delated";
    }
}
