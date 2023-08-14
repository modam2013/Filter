package ru.hogwarts.school.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;


@RestControllerAdvice
public class ExceptionsHandler {
    @ExceptionHandler(
            {
                    StudentNotFoundException.class,
                    FacultyNotFoundException.class,
                    FacultyNameNotFoundException.class,
                    AvatarNotFoundException.class
            }
    )
    public ResponseEntity<?> handleNotFound(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ex.getMessage());
    }
}