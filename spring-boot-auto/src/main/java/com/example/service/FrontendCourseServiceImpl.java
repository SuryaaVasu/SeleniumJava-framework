package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("courseService") //by name
public class FrontendCourseServiceImpl implements ICourseService {

	@Override
	public List<String> showCourses() {
		
		return Arrays.asList("html","css","javascript");
	}

}
