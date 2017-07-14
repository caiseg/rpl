package com.platform.common.exception;

import com.alibaba.fastjson.JSONObject;

public class ErrorInfo {
	 
public static final Integer OK = 200;
public static final Integer ERROR = 100;
 
private Integer code;
private String message;
private String url;
public Integer getCode() {
	return code;
}
public void setCode(Integer code) {
	this.code = code;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public static Integer getOk() {
	return OK;
}
public static Integer getError() {
	return ERROR;
}
@Override
public String toString() {
	return JSONObject.toJSONString(this);
}


 
}