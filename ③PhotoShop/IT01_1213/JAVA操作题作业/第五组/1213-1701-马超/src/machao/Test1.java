package machao;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// ��дJAVA��������һ����λ�������������ʮλ�Ƕ��١�

		System.out.println("������һ����λ��");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("������ʮλ����" + i / 10 % 10);
	}
}
