package decimal;

import java.util.Scanner;

public class Decimal {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("请输入第一个小数");
	
	double a=sc.nextDouble();
		
	System.out.println("请输入第二个小数");
	
	double b=sc.nextDouble();
		
	if (a>b){
	System.out.println(a+">"+b);
	}
	else if(a==b){
		System.out.println(a+"="+b);
	}
	else{
		System.out.println(a+"<"+b);
	}

	
	

}
}