package com.ztt;

import java.util.Scanner;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��12��13�� ����7:51:22 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test02 {

	public static void main(String[] args) {
		
		//����10-99֮���һ��ʮ���������������Ӧ��ʮ��������

		Scanner sc = new Scanner(System.in);
		
		System.out.println("����һ��ʮ���Ƶ�������");
		
		int a = sc.nextInt();
		
		if (a <= 99 && a>= 10) {
			
			String i = Integer.toString(a,16);
			
			System.out.println("ת��Ϊʮ������Ϊ��");
			
			System.out.println(i);
			
		} else {
			
			System.out.println("������Ĳ��ڷ�Χ��");

		}

	}

}
