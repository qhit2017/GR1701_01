package com.jkl;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;


public class Diyiti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������С��");
		double a =sc.nextDouble();
		double b = sc.nextDouble();
		if (a==b) {
			System.out.println("�������");
		} else {
			System.out.println("��������");
		}
	}
}
