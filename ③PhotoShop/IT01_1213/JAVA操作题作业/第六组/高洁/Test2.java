import java.util.Scanner;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��12��12�� ����11:58:01
 */
public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();

		if (s >= 10 && s <= 99) {

			System.out.println(Integer.toString(s, 16));

			System.out.println(Integer.valueOf("f", 16));

		} else {
			System.out.println("������Χ");
		}
	}

}
