package machao;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
       //��дJAVA����ͨ���������룬�ж�һ�������������Ǹ�����
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		System.out.print("������һ����:");
		
		if (a > 0) {
			System.out.println("�������������!");
		} else if (a == 0) {
			System.out.println("�����������!");
		} else {
			System.out.println("��������Ǹ���!");
		}
		sc.close();
	}

	}

