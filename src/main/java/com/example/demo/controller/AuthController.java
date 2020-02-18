package com.example.demo.controller;

import com.example.demo.serivce.AuthService;
import com.example.demo.model.FacebookAuthModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("login/facebook")
    public ResponseEntity<?> facebook(@RequestBody @Valid FacebookAuthModel facebookAuthModel) {
        return authService.facebook(facebookAuthModel);
    }
}
