package com.saj;

import java.util.ArrayList;
import java.util.Scanner;

public interface Interfaces {

	void addEmployee(ArrayList<Employee> arrayList, Scanner sc);

	void removeEmployee(ArrayList<Employee> arrayList, String name);

	void setEmployee(ArrayList<Employee> arrayList, Scanner sc);

	Employee findEmployee(ArrayList<Employee> arrayList, String name);

	void infoArraylistEmployee(ArrayList<Employee> arrayList);

}
