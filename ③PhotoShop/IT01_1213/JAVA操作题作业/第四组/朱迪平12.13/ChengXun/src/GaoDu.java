import java.util.Scanner;

/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��12��13�� ����6:55:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class GaoDu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����߶�");
		double h=sc.nextDouble();
		double hs=h/2;
		int c;
		for ( c = 2; c <=10; c++) {
			h=h+hs;
		}
		System.out.println("��ʮ�����ʱ"+h);
		

	}

}
