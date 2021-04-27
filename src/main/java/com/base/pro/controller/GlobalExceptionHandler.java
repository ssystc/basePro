package com.base.pro.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;



@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

//	@ExceptionHandler(ExamException.class)
//	public CommonResponse.ErrResponse httpSessionRequiredException(HttpServletResponse response, ExamException ex){
//		response.setStatus(HttpStatus.OK.value());
//		return new CommonResponse.ErrResponse(ex.getErrCode(), ex.getMessage());
//	}
	
}
