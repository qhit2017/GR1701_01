package com;

import java.util.ArrayList;
import java.util.Scanner;

public interface Score {
	
	
	void addStudent(ArrayList<Student> arraylist ,Scanner sc);
	void info(ArrayList<Student> arraylist);
	double getMax(ArrayList<Student> arraylist, String subject);
	

}
