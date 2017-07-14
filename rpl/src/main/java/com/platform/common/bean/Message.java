 package com.platform.common.bean;

import com.alibaba.fastjson.JSONObject;


/**
 * 
  * 处理的返回的结果bean  成功或者失败 	
  * @author 王求卿[wangqiuqing] Tel:18101037995
  * @createDate 2017-7-14 下午1:32:12
 */
public class Message {

	public static final Integer OK = 200;
	public static final Integer ERROR = 100;
	
	private Integer type;//处理结果类型
	private String msg;//处理结果信息
	private String detail;
	
	
	 /**
	  * 构造函数[constructor fun] Message.
	  * @param type
	  * @param msg
	  */
	 
	 public Message() {
			super();
		}
	 
	 
	public Message(Integer type, String msg) {
		super();
		this.type = type;
		this.msg = msg;
	}
	
	/**
	  * 构造函数[constructor fun] Message.
	  * @param type
	  * @param msg
	  * @param detail
	  */
	 
	public Message(Integer type, String msg, String detail) {
		super();
		this.type = type;
		this.msg = msg;
		this.detail = detail;
	}

	
	public Integer getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	
	public void setType(Integer type) {
		this.type = type;
	}


	/**
	 * msg
	 *
	 * @return  the msg
	 * @since   CodingExample Ver(编码[bian ma]范例[fan li]查看) 1.0
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
	 * detail
	 *
	 * @return  the detail
	 * @since   CodingExample Ver(编码[bian ma]范例[fan li]查看) 1.0
	 */
	
	public String getDetail() {
		return detail;
	}


	/**
	 * @param detail the detail to set
	 */
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public String toJson(){
		return JSONObject.toJSONString(this);
	}
}
