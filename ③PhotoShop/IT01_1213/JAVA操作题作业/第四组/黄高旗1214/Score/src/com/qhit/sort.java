import java.util.Scanner;


public class Paixun {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("输入四个数");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int s=0;
	if (a>b) {
		s=a;
		a=b;
		b=s;
		
	}if (a>c) {
		s=a;
		a=c;
		c=s;
		
	}
	if (a>d) {
		s=a;
		a=d;
		d=s;
		
	}if (b>c) {
		s=b;
		b=c;
		c=s;
		
	}if (b>d) {
		s=b;
		b=d;
		d=s;
		
	}
	if (c>d) {
		s=c;
		c=d;
		d=s;
		
	}
System.out.println(a+"<"+b+"<"+c+"<"+d);


	
	
}

}
