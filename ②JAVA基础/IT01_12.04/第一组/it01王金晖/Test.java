package com.examination;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		ScoreService service = new ScoreService();
		Scanner sc = new Scanner(System.in);
		boolean isQuit = true;
		boolean isSubQuit = false;
		service.help();
		int key = 0;
		while (isQuit) {
			System.out.println("请输入一个指令， 回车键执行");
			switch (key) {
			case 1:
				service.addStudent(arrayList, sc);
				break;
			case 2:
				service.infoStudent(arrayList);
				break;
			case 3:
				service.helpSub();
				isSubQuit = true;
				while (isSubQuit) {
					sub(arrayList, service, key);

				}
				break;
			case 4:
				isQuit = false;
				break;
			default:
				break;
			}
		}System.out.println("再见  欢迎下次使用");

	}

	private static void sub(ArrayList<Student> arrayList, ScoreService service,
			int key) {
		boolean isSubQuit;
		switch (key) {
		case 1:
		   service.max(arrayList, "总成绩");
			break;
		case 2:
			service.max(arrayList, "数学");
			break;
		case 3:
			service.max(arrayList, "语文");
			break;
		case 4:
			service.max(arrayList, "英语");
			break;
		case 5:
		    isSubQuit = false;
			break;

		default:
			break;
		}
	}

}
