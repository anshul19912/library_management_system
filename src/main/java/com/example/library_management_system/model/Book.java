package com.example.library_management_system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Library_Management_System")
public class Book {
    @Id
            @GeneratedValue
            long id;

    String bookName;
    String subject;
    String writer;
    String allocationStatus;
    String studentName;

    Book(){}

    Book(String bookName, String subject, String writer, String allocationStatus, String studentName){
        this.bookName = bookName;
        this.subject  = subject;
        this.writer = writer;
        this.allocationStatus = allocationStatus;
        this.studentName = studentName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getAllocationStatus() {
        return allocationStatus;
    }

    public void setAllocationStatus(String allocationStatus) {
        this.allocationStatus = allocationStatus;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
