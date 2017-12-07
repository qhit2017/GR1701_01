package com.Addressbook;

public class Contacts{

    private	 String name;
    private	 String sex;
    private	 String telnumber;
    
    
	public Contacts() {
		
	}
	
	
	public Contacts(String name, String sex, String telNumber) {
		
		
		this.name = name;
		this.sex = sex;
		this.telnumber = telNumber;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTelNumber() {
		return telnumber;
	}
	public void setTelNumber(String telNumber) {
		this.telnumber = telNumber;
	}
	@Override
	public String toString() {
		return "Addressbook [name=" + name + ", sex=" + sex + ", telNumber="
				+ telnumber + "]";
	}
	
    
    
    
}
