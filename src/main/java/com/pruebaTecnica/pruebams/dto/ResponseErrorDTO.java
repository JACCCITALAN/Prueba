package com.pruebaTecnica.pruebams.dto;

import java.io.Serializable;

public class ResponseErrorDTO implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5730045931450612223L;
	
	/** The code. */
	private int code;
	
	/** The message. */
	private String message;
	
	/** The identifier. */
	private String identifier;
	
	/**
	 * Instantiates a new response error VO.
	 */
	public ResponseErrorDTO() {
		
	}
	
	/**
	 * Instantiates a new response error VO.
	 *
	 * @param code the code
	 * @param message the message
	 */
	public ResponseErrorDTO(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	/**
	 * Instantiates a new response error VO.
	 *
	 * @param code the code
	 * @param message the message
	 * @param identifier the identifier
	 */
	public ResponseErrorDTO(int code, String message,String identifier) {
		super();
		this.code = code;
		this.message = message;
		this.identifier = identifier;
	}
	
	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
	
	/**
	 * Sets the code.
	 *
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
	
	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * Sets the message.
	 *
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets the identifier.
	 *
	 * @return the identifier
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * Sets the identifier.
	 *
	 * @param identifier the new identifier
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

}
