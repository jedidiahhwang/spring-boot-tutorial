package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping // Same as a GET request.
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Jeddy", "jhwang@gmail.com", LocalDate.of(1995, Month.JULY, 18), 26)); // This will automatically parse it into JSON.

    }
}
