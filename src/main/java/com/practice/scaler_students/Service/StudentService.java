package com.practice.scaler_students.Service;

import com.practice.scaler_students.Model.Students;
import com.practice.scaler_students.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    public List<Students> getAllStudents() {

        return studentRepository.findAll();
    }

    public Optional<Students> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Students createStudent(Students student) {

        return studentRepository.save(student);
    }

    public Students updateStudent(Long id, Students updatedStudent) {
        if (studentRepository.existsById(id)) {
            updatedStudent.setId(id);
            return studentRepository.save(updatedStudent);
        }
        return null;
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
