package com.gaojie.qhit01;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��18�� ����11:57:06
 */
public class Test3 {
	public static void main(String[] args) {

		System.out.println("1000�������е�����Ϊ��");
		
		int sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			
			if (i % 2 != 0) {
				System.out.print(i + "\t");
				sum += 1;
				
				if (sum % 5 == 0) {
					System.out.println();
				}
			}
		}

	}

}
