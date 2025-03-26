package com.example.lab11.controller.task4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final Student student = new Student();
    @GetMapping
    public String getStudent() {
        return "Student: " + student.getName() + ", Age: " + student.getAge();
    }
    @GetMapping("/is-adult/{age}")
    public String isAdult(@PathVariable int age) {
        return age >= 18 ? "Age " + age + ": You are an adult." : "Age " + age + ": You are not an adult.";
    }
    @GetMapping("/update-age/{age}")
    public String setStudentAge(@PathVariable int age) {
        student.setAge(age);
        return "Student's age updated to " + age;
    }
}
