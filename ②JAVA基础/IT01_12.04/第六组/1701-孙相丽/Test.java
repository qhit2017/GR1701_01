package com.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
	ArrayList<Student> arrayList=new ArrayList<Student>();
	ScoreService service=new ScoreService(); 
	service.helpInfo();
		Scanner sc = new Scanner(System.in);
		boolean isQuit=true;
		boolean isSubQuit=false;
		int key=0;
		while (isQuit) {
			key=sc.nextInt();
			switch (key) {
			case 1:
				service.addStudent(arrayList, sc);
				break;
            case 2:
            	service.infoStudent(arrayList);
				break;
            case 3:
            	service.helpSubInfo();
            	isSubQuit=true;
            	while (isSubQuit) {
            		key=sc.nextInt();
            		switch (key) {
					case 1:
						service.getMax(arrayList, "语文");
						break;

                    case 2:
                    	service.getMax(arrayList, "数学");
						break;
                    case 3:
                    	service.getMax(arrayList, "英语");
						break;
                    case 4:
                    	service.getMax(arrayList, "总成绩");
						break;
                    case 5:
						isSubQuit=true;
						break;
					default:
						break;
					}
				}
				break;
            case 4:
				isQuit=false;
				break;
			default:
				break;
			}
		}
		System.out.println("再见");
		
        sc.close();
	}

}
