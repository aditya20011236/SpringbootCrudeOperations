package com.example.springbootcrudeoperation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootcrudeoperation.Entity.College;
@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {

}
