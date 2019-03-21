package com.edu.pattern.prototype.userWork;

import java.io.Serializable;

/**
 * 消息验证
 * @author sun
 *
 */
public class Verify implements Serializable{

	private static final long serialVersionUID = 7604756969226653581L;

	private boolean success;
	
	private String  message;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Verify [success=" + success + ", message=" + message + "]";
	}
}
