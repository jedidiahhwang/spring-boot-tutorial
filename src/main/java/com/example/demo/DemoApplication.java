package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController // Provides the ability for this class to serve RESTful endpoints.

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping // Same as a GET request.
	public List<Student> hello() {
		return List.of(new Student(1L, "Jeddy", "jhwang@gmail.com", LocalDate.of(1995, Month.JULY, 18), 26)); // This will automatically parse it into JSON.

	}
}
