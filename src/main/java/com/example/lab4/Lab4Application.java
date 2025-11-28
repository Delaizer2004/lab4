package com.example.lab4;

import com.example.lab4.entity.*;
import com.example.lab4.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab4Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab4Application.class, args);
	}

	@Bean
	CommandLineRunner run(StudentService studentService,
						  TeacherService teacherService,
						  LessonService lessonService,
						  PassportService passportService) {
		return args ->{
			Teacher t = new Teacher("Mr. Smith");
			teacherService.save(t);

			Passport p = new Passport("AB123456");
			p.setTeacher(t);
			passportService.save(p);

			Lesson l = new Lesson("Math");
			l.setTeacher(t);
			lessonService.save(l);

			Student s = new Student("Dmytro", 20);
			studentService.save(s);

			System.out.println("Spring Boot CRUD finished");
		};
	}

}
