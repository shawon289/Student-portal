package com.example.studentportal.controller;

import com.example.studentportal.dto.request.SignUpRequest;
import com.example.studentportal.model.SignUpModel1;
import com.example.studentportal.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student/")
public class StudentSignInAndSignUpController {
    private final StudentRepository studentRepository;

    public StudentSignInAndSignUpController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("signup")
    public void signUP(@RequestBody SignUpRequest SignupRequest) {
        SignUpModel1 signUpModel1 = new SignUpModel1();
        signUpModel1.setStudentID(SignupRequest.getStudentID());
        signUpModel1.setName(SignupRequest.getStudentName());
        signUpModel1.setDept(SignupRequest.getStudentDept());
        signUpModel1.setPass(SignupRequest.getStudentPass());
        studentRepository.save(signUpModel1);
    }

    @GetMapping("/signin")
    public String signin() {

        return null;
    }
}
