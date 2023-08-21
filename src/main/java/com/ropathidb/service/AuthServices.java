package com.ropathidb.service;


import com.ropathidb.model.dto.LoginRequest;
import com.ropathidb.security.AuthManager;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AuthServices {

  @Autowired
  AuthManager authManager;

  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
    return authManager.authenticateUser(loginRequest);
  }

}
