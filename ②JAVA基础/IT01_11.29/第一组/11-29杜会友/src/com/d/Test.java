package com.d;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		ArrayList<Employee> arrayList =new ArrayList<Employee>();
		Employee aaa=new Employee(null, null, null, null, null);
		arrayList.add(aaa);
		arrayList.add(new Employee(null, null, null, null, null));
		arrayList.add(new Employee(null, null, null, null, null));
		arrayList.add(new Employee(null, null, null, null, null));
		arrayList.add(new Employee(null, null, null, null, null));
		arrayList.add(new Employee(null, null, null, null, null));
		arrayList.add(new Employee(null, null, null, null, null));
		System.out.println();
		System.out.println(arrayList.size());
		arrayList.get(0);
	}

}
