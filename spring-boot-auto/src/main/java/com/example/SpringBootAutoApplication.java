package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.payment.IPaymentProcess;
import com.example.service.ICourseService;

@SpringBootApplication
public class SpringBootAutoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutoApplication.class, args);
	}

	/*  * //3ways to autowiring  */	
    @Autowired
	//by type
	//@Qualifier("frontendCourseServiceImpl") //1
	private ICourseService courseService; //new object 
   
	@Autowired
	//by name  ==if the bean name and the instance variable name are SAME
	private ICourseService cloudCourse; 
	
	
	// by constructor
	private ICourseService backendCourse;
	public SpringBootAutoApplication(@Qualifier("backendCourseServiceImpl") ICourseService backendCourse) {
		super();
		this.backendCourse = backendCourse;
	}
	
	// 
	@Autowired
    @Qualifier("netpay")
    private IPaymentProcess pay;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println();
		courseService.showCourses().forEach(System.out::println);
		System.out.println();
	    cloudCourse.showCourses().forEach(System.out::println);
	    System.out.println();
		backendCourse.showCourses().forEach(System.out::println);
		System.out.println();
		pay.payBill();
		
	}

	
}
