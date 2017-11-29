package count;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个数");
	int count=sc.nextInt();
	if(count>0){
		System.out.println("就是正数");
	}else{
		System.out.println("就是负数");
	}
	

}
}