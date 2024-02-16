package in.nileshit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.nileshit.binding.ExceptionInfo;

@RestControllerAdvice
public class AppExceptionHandler 
{
	@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> handleAE(ArithmeticException ae)
	{
		ExceptionInfo exception = new ExceptionInfo();
		exception.setCode("AIT0004");
		exception.setMsg(ae.getMessage());
		
		return new ResponseEntity<ExceptionInfo>(exception,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
