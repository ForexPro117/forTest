package com.test.templates;

public class TestEntity {
	
	private String name;
	private int age;
	private String lastname;
	public static String hne="sdsdsd";
	
	public TestEntity(String name, int age, String lastname) {
		super();
		this.name = name;
		this.age = age;
		this.lastname = lastname;
	}

	public String getName() {
		System.err.println("0000000000000000000000000");
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	
	
	
	
}
