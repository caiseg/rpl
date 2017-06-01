package com.platform.framework.entity;

import java.sql.Timestamp;
import java.util.Date;

public class Test {

	private String id;

	private String name;

	private int age;

	private Date birthday;

	private Timestamp birthtime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Timestamp getBirthtime() {
		return birthtime;
	}

	public void setBirthtime(Timestamp birthtime) {
		this.birthtime = birthtime;
	}

}
