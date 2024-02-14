package com.example.springbootcrudeoperation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootcrudeoperation.Entity.College;
import com.example.springbootcrudeoperation.Repository.CollegeRepository;

@Service
public class CollegeServiceImple implements CollegeService {
	@Autowired
	private CollegeRepository collegeRepository;

	@Override
	public College saveCollege(College college) {

		return collegeRepository.save(college);
	}

}
