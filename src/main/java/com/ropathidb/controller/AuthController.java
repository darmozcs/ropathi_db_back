package com.ropathidb.controller;

import com.ropathidb.model.dto.LoginRequest;
import com.ropathidb.service.AuthServices;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class AuthController {

  @Autowired
  AuthServices authRegiserService;


  @PostMapping("/sign-in")
  public ResponseEntity<?> authenticateUser(@RequestParam("email") String email, @RequestParam("password") String pass) {
    return authRegiserService.authenticateUser(LoginRequest.builder().email(email).password(pass).build());
  }

}
