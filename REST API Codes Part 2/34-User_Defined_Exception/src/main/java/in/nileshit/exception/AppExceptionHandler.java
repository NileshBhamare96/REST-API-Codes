package in.nileshit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.nileshit.binding.ExceptionInfo;


@RestControllerAdvice
public class AppExceptionHandler {
           
        @ExceptionHandler(value=NoDataFoundException.class)
	public ResponseEntity<ExceptionInfo> handleNDFE(NoDataFoundException ndfe) {
		ExceptionInfo exception = new ExceptionInfo();

		exception.setMsg(ndfe.getMessage());
		exception.setCode("AIT0004");
                
                // 400 : -Client Side error
		return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);
	}

}
