import java.util.Scanner;


public class ExameThree {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个数");

		int a = sc.nextInt();
		if (a<10) {
			System.out.println("一位数");
			
		}
		if (a<100&&a>=10) {
			System.out.println("两位数");
		}
		if (a<1000&&a>=100) {
			System.out.println("三位数");
		}
		if (a<10000&&a>=1000) {
			System.out.println("四位数");
		}
		
	
	}

}
