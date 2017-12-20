package com.jkl;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;


public class Diyiti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个小数");
		double a =sc.nextDouble();
		double b = sc.nextDouble();
		if (a==b) {
			System.out.println("两数相等");
		} else {
			System.out.println("两数不等");
		}
	}
}
