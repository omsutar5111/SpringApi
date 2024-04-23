package com.practice.scaler_students.Model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Data
@Table(name = "student")
public class Students {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    private Date enrollmentDate;
    private String psp;
    private Long batchId;
    private boolean isActive;

    // Constructors, getters, and setters
    public Students() {
    }

    public Students(String firstName, String lastName, String email, Date dateOfBirth, Date enrollmentDate, String psp, Long batchId, boolean isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.enrollmentDate = enrollmentDate;
        this.psp = psp;
        this.batchId = batchId;
        this.isActive = isActive;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Date getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(Date dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    public Date getEnrollmentDate() {
//        return enrollmentDate;
//    }
//
//    public void setEnrollmentDate(Date enrollmentDate) {
//        this.enrollmentDate = enrollmentDate;
//    }
//
//    public String getPsp() {
//        return psp;
//    }
//
//    public void setPsp(String psp) {
//        this.psp = psp;
//    }
//
//    public Long getBatchId() {
//        return batchId;
//    }
//
//    public void setBatchId(Long batchId) {
//        this.batchId = batchId;
//    }
//
//    public boolean isActive() {
//        return isActive;
//    }
//
//    public void setActive(boolean active) {
//        isActive = active;
//    }







}
