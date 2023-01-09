package com.nissan.common;

import org.springframework.http.HttpStatus;

public class APIResponse {
	
	//declare variables
	private Integer status; //200,401,404
	private Object data;  //emailId,roleId,jwtToken
	private Object error; //error message
	
	//default
	public APIResponse() {
		this.status=HttpStatus.OK.value();
		this.data=data;
		this.error=error;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}
	
	

}
