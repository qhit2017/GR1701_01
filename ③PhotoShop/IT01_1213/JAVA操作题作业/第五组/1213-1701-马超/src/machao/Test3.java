package machao;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		//��дJAVA����ͨ���������룬�ж��������Ĵ�С��
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����a:");
		float a = sc.nextFloat();
		System.out.println("������ڶ�����b:");
		float b = sc.nextFloat();

		System.out.print("�������������:");
		System.out.println((a > b) ? "a>b" : (a == b) ? "a=b" : "a<b");

		sc.close();
	}
}
