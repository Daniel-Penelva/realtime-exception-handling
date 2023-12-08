package com.api.realtimeexceptionhandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.realtimeexceptionhandling.customexceptions.EmailValidationException;
import com.api.realtimeexceptionhandling.customexceptions.FirstNameValidationException;
import com.api.realtimeexceptionhandling.entity.User;
import com.api.realtimeexceptionhandling.errors.Error;

@RestController
public class UserController {

    // localhost:9090/user
    @PostMapping("/user")
    public User addUser(@RequestBody User user) {

        if (!user.getEmail().contains("@")) {
            throw new EmailValidationException("Not a valid email :: " + user.getEmail());
        }

        if (user.getFname().contains("!")) {
            throw new FirstNameValidationException("Not a valid name :: " + user.getFname());
        }

        return user;
    }

    @ExceptionHandler(value = EmailValidationException.class)
    public ResponseEntity<Error> emailValidation(EmailValidationException exception) {

        Error error = new Error(1000, exception.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}

/* Testando no Postman:
 * 
 * {
 *      "id": "1",
 *      "fname": "!Daniel",
 *      "lname": "Penelva",
 *      "email": "d4n.andradegmail.com"
 * }
*/