package com.saj;

public abstract class Person {
	private String getContent;

	public Person(String getContent) {
		super();
		this.getContent = getContent;
	}

	public abstract String getContent();

	abstract void say();

}
