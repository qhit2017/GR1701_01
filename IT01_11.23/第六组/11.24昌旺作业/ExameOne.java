import java.util.Scanner;


public class ExameOne {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数");
		double a = sc.nextDouble();
		
		System.out.println("请输入一个数");
		double b = sc.nextDouble();
		
		if (a==b) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
	}

}
