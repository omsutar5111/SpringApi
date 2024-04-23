package com.practice.scaler_students.Repository;

import com.practice.scaler_students.Model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students,Long> {

}
