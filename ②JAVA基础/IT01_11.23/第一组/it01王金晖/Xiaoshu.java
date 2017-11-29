package JTC;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/
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

