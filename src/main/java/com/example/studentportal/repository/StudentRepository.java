package com.example.studentportal.repository;

import com.example.studentportal.model.SignUpModel1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<SignUpModel1,Long> {

}
