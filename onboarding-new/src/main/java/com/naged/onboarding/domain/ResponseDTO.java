package com.naged.onboarding.domain;


import java.io.Serializable;


public class ResponseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String status;
	private String message;
	private Integer responseCode;
	private transient Object data;

	public ResponseDTO(String status, String message, Integer responseCode, Object data) {
		this.status = status;
		this.message = message;
		this.responseCode = responseCode;
		this.data = data;
	}

	public ResponseDTO(String status, String message, Integer responseCode) {
		this.status = status;
		this.message = message;
		this.responseCode = responseCode;
	}

	@Override
	public String toString() {
		return "ResponseDTO{" +
				"status='" + status + '\'' +
				", message='" + message + '\'' +
				", responseCode=" + responseCode +
				", data=" + data +
				'}';
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public Object getData() {
		return data;
	}
}
