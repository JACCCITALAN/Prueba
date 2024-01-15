package com.pruebaTecnica.pruebams.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class BaseResponseVO.
 *
 * @param <T> the generic type
 */
public class BaseResponseDTO<T>{


	/** The success. */
	private Boolean success;
	
	/** The errors. */
	private List<ResponseErrorDTO> errors;
	
	/** The data. */
	private T data;
	
	/** The total size. */
	private Integer totalSize;

	/**
	 * Instantiates a new base response VO.
	 */
	public BaseResponseDTO(){}
	
	/**
	 * Instantiates a new base response VO.
	 *
	 * @param success the success
	 * @param errors the errors
	 * @param data the data
	 * @param totalSize the total size
	 */
	public BaseResponseDTO ( Boolean success, List< ResponseErrorDTO > errors, T data, Integer totalSize ) {
		this.success = success;
		this.errors = errors;
		this.data = data;
		this.totalSize = totalSize;
	}

	/**
	 * Gets the total size.
	 *
	 * @return the totalSize
	 */
	public Integer getTotalSize() {
		return totalSize;
	}
	
	/**
	 * Sets the total size.
	 *
	 * @param totalSize the totalSize to set
	 */
	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}
	
	/**
	 * Gets the success.
	 *
	 * @return the succes
	 */
	public Boolean getSuccess() {
		return success;
	}
	
	/**
	 * Sets the success.
	 *
	 * @param succes the succes to set
	 */
	public void setSuccess(Boolean succes) {
		this.success = succes;
	}
	
	/**
	 * Gets the errors.
	 *
	 * @return the errors
	 */
	public List<ResponseErrorDTO> getErrors() {
		
		if(errors == null) {
			errors = new  ArrayList<ResponseErrorDTO>();
		}
		
		return errors;
	}
	
	/**
	 * Sets the errors.
	 *
	 * @param errors the errors to set
	 */
	public void setErrors(List<ResponseErrorDTO> errors) {
		this.errors = errors;
	}
	
	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	
	/**
	 * Sets the data.
	 *
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	
	/**
	 * Adds the error.
	 *
	 * @param error the error
	 */
	public void addError(ResponseErrorDTO error){
		this.getErrors().add(error);
	}
}
