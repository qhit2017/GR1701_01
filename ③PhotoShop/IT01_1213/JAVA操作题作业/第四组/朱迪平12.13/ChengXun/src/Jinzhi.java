import java.util.Scanner;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年12月13日 下午6:47:22 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Jinzhi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个10~99的数");
		int  a=sc.nextInt();
		String string = Integer.toString(a, 16);
		System.out.println(string);
		
	}

}
