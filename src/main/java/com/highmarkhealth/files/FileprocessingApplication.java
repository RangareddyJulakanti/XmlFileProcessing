package com.highmarkhealth.files;

import com.highmarkhealth.files.entity.Student;
import com.highmarkhealth.files.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FileprocessingApplication {
    @Autowired
    StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(FileprocessingApplication.class, args);
	}

	@GetMapping("/")
	public Student m1(){
	    Student s= new Student();
	    s.setId(1);
	    s.setName("ranga");
        studentRepository.save(s);
		return studentRepository.studentInfo(1);
	}

}
