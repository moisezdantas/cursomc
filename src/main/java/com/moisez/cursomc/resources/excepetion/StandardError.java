package com.moisez.cursomc.resources.excepetion;

import java.io.Serializable;

public class StandardError implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long timeStmp;
	
	public StandardError(Integer status, String msg, Long timeStmp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStmp = timeStmp;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the timeStmp
	 */
	public Long getTimeStmp() {
		return timeStmp;
	}

	/**
	 * @param timeStmp the timeStmp to set
	 */
	public void setTimeStmp(Long timeStmp) {
		this.timeStmp = timeStmp;
	}
	
	

}
