import java.util.Scanner;

/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��12��13�� ����6:47:22 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Jinzhi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����һ��10~99����");
		int  a=sc.nextInt();
		String string = Integer.toString(a, 16);
		System.out.println(string);
		
	}

}
