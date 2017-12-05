package com.saj;

import java.util.ArrayList;
import java.util.Scanner;

public interface Interfaces {

	void addStudent(ArrayList<Student> arrayList, Scanner sc);

	void infoStudent(ArrayList<Student> arrayList);

	double getMax(ArrayList<Student> arrayList, String subject);

}
