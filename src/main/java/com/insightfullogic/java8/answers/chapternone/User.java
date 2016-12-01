package com.insightfullogic.java8.answers.chapternone;

/**
 * Created by wangchangye on 2016/12/1.
 */

public class User {
	private int age;
	private String name;

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {

		return age;
	}

	@Override
	public String toString() {
		return "User{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(int age, String name){
		this.age=age;
		this.name=name;
	}
}
