package lk.quadrate.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDateTime;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException userNotFoundException){

        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        ApiExceptionResponse apiExceptionResponse = new ApiExceptionResponse(
                userNotFoundException.getMessage(),
               HttpStatus.BAD_REQUEST,
                LocalDateTime.now()
        );
        return new ResponseEntity<>(apiExceptionResponse,badRequest);

    }
}
