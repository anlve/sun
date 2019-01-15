package com.anlve.sun.common;

import java.util.ArrayList;
import java.util.List;

public class ResultDTO<T> {

	private String returnCode = RtnConstant.RETURN_CODE_SUCCESS;

	private String returnMsg = RtnConstant.RETURN_MSG_SUCCESS;

	private List<T> list = new ArrayList<T>();

	private int total;
	
	private T data;

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
