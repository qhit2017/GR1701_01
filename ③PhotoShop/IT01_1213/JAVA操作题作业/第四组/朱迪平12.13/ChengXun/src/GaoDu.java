import java.util.Scanner;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年12月13日 下午6:55:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class GaoDu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入高度");
		double h=sc.nextDouble();
		double hs=h/2;
		int c;
		for ( c = 2; c <=10; c++) {
			h=h+hs;
		}
		System.out.println("第十次落地时"+h);
		

	}

}
