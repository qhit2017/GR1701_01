package Zuoye1213;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Zy_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��ʮ��������");
		int s = sc.nextInt();
		if (s <= 99 && s >= 10) {
			String a = Integer.toString(s, 16);
			System.out.println("ת��Ϊ16����Ϊ��" + a);
		} else {
			System.out.println("����������ֲ��ڷ�Χ�ڣ�" 
							+ "����10~99֮��ѡȡ���֡�");
		}
	}
}
