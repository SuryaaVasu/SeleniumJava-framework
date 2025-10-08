package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("cloudCourse")// by name
//@Service
public class CloudCourseServiceImpl implements ICourseService {

	@Override
	public List<String> showCourses() {
		
		return Arrays.asList("aws","Azure","Gcp");
	}

}
