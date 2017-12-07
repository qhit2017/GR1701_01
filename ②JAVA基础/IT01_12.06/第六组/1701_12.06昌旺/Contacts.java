package com.it01;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {

	private String name;
	private String gender;
	private String phone;
	
	
	public Contacts() {
		
	}

	public Contacts(String name, String gender, String phone) {
		super();
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", gender=" + gender + ", phone="
				+ phone + "]";
	}

	public String getSex() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSex(String sex) {
		// TODO Auto-generated method stub
		
	}

	public Object getTelNum() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTelNum(Object telNum) {
		// TODO Auto-generated method stub
		
	}

	public String getNum() {
		// TODO Auto-generated method stub
		return null;
	}

	public void helpinfo() {
		// TODO Auto-generated method stub
		
	}

	public void addContatc(ArrayList<Contacts> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	public void findByName1(ArrayList<Contacts> arrayList, String name2) {
		// TODO Auto-generated method stub
		
	}

	public void infoContatc(ArrayList<Contacts> arrayList) {
		// TODO Auto-generated method stub
		
	}

	public void findByName(ArrayList<Contacts> arrayList, String sex) {
		// TODO Auto-generated method stub
		
	}
	
	
}
