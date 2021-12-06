package com.ssk.model;


import java.io.Serializable;

/**
 * @author 惊云
 * @date 2021/12/2 19:07
 */
public class User implements Serializable {
	private static final long serialVersionUID = 5098578977158857313L;

	private Long id;

	private String name;

	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
