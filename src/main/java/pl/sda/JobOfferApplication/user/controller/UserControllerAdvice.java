package pl.sda.JobOfferApplication.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import pl.sda.JobOfferApplication.user.exception.UserException;

@ControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(UserException.class)
    public ResponseEntity<String> handleUserException(UserException e){

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
}
