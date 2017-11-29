package JTC;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/** 
 * @author  作者:xuyunmeng
 * @date    创建时间：2017年11月16日 下午7:20:59 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Xiaoshu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("输入小数a");
		float a=sc.nextFloat();
		
		System.out.println("输入小数b");
		float b=sc.nextFloat();
		if(a>b){
			System.out.println(a+">"+b);
		}
		else {
			System.out.println(a+"<"+b);
		}
		
		
	}

	
}

