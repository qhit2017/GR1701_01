package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> arraylist=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		ScoreService scoreService=new ScoreService();
		scoreService.help();
		boolean isQuit=true;
		boolean suisQuit=false;
		while (isQuit) {
			int key=sc.nextInt();
			switch (key) {
			case 4:
				isQuit=false;
				break;
			case 1:
				scoreService.addStudent(arraylist, sc);
				scoreService.info(arraylist);
				break;
			case 2:
				scoreService.info(arraylist);
				break;
			case 3:
				 suisQuit=true;
				scoreService.subHelp();
				while (isQuit) {
					
					
					key=sc.nextInt();
					switch (key) {
					case 1:
						scoreService.getMax(arraylist, "总分");	
						break;
					case 2:
						scoreService.getMax(arraylist, "数学");	
						break;
					case 3:
						scoreService.getMax(arraylist, "语文");	
						break;
					case 4:
						scoreService.getMax(arraylist, "英语");	
						break;

					case 5:
						scoreService.getMax(arraylist, "返回子菜单");	
						scoreService.help();
						break;


					default:
						break;
					}
				}
				
				break;

			default:
				break;
			}
		}
		System.out.println("离开");
	}

}
