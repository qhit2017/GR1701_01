package jtc;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月23日 下午7:08:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ZuoYe1123_5 {

	public static void main(String[] args) {
		//for做法
		int sum = 0;
		for(int a = 1;a <=100;a++){
		    sum += (a%2!=0)?a:0;
		}
		System.out.println("1-100内奇数和等于："+sum);
		System.out.println();
		int he = 0;
		int b = 1;
		while(b <= 100){
			he += (b%2 != 0)?b:0;
			b++;
		}
		System.out.println("1-100内奇数和等于："+he);
	}
}
