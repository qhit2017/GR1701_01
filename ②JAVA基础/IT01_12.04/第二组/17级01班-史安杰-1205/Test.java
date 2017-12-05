package com.saj;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Student>arrayList=new ArrayList<Student>();
		Iscore i=new Iscore();
		boolean a=true; 
		boolean asub=false;
		int key=0;
		i.helpinfo();
		while(a){
			System.out.println("请输入指令，并按回车键");
			key=sc.nextInt();
			
			switch (key) {
			case 1:
				i.addStudent(arrayList, sc);
				break;
			case 2:
				i.infoStudent(arrayList);
				break;	
			case 3:
				asub = true;
				i.helpsubinfo();
				
				
				while (a) {
					key=sc.nextInt();
					switch (key) {
					case 1:
						i.getMax(arrayList, "总成绩");
						break;
					case 2:
						i.getMax(arrayList, "语文");
						break;
					case 3:
						i.getMax(arrayList, "数学");
						break;
					case 4:
						i.getMax(arrayList, "英语");
						break;
					case 5:
						asub=false;
						break;

					default:
						break;
					}
					
				}
				break;	
			case 4:
				a=false;
				break;
			default:
				break;
			}
		}
		System.out.println("退出系统");

	}

}
