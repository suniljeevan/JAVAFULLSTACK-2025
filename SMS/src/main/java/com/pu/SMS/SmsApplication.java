package com.pu.SMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.pu.entity.Student;
import com.pu.entity.StudentRepository;

import jakarta.annotation.PostConstruct;

@ComponentScan("com.pu")
@EnableJpaRepositories(basePackages = "com.pu.entity")
@EntityScan(basePackages = "com.pu.entity")
@SpringBootApplication(scanBasePackages = "com.pu")
public class SmsApplication {
	 @Autowired
	    private StudentRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}
	       
	@PostConstruct
	public void init() {
		Student student = new Student();
	       student.setRoll(1);
	       student.setName("god");
	       student.setMarks(100);
	       repo.save(student);
	       

	}

}
