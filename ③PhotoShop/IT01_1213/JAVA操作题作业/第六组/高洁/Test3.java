import java.util.Scanner;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��12��12�� ����1:07:54
 */
public class Test3 {
	public static void main(String[] args) {
		int q = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ϊ��λ��");
		int n = sc.nextInt();

		for (int j = 1;; j++) {
			int a = j;
			int b = 0;

			for (int i = 0;; i++) {

				if (a == 0) {
					break;
				} else {
					a = a / 10;
					b = b + 1;
				}

			}

			if (b == n) {
				if (j % 10 == 6 && j % 3 == 0) {
					q = q + 1;
					System.out.println(j);

				}
			}
			if (b > n) {
				System.out.println(q);
				break;
			}
		}
	}

}
