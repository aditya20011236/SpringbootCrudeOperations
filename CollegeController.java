package com.example.springbootcrudeoperation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcrudeoperation.Entity.College;
import com.example.springbootcrudeoperation.Service.CollegeService;

@RestController
public class CollegeController {
	@Autowired
	private CollegeService collegeService;

	@PostMapping("/college")
	public College saveCollege(@RequestBody College college) {

		return collegeService.saveCollege(college);

	}

}
