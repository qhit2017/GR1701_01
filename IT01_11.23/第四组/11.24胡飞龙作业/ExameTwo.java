import java.util.Scanner;


public class ExameTwo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个数");
		
		int a = sc.nextInt();
		int c=a/10%10;
		System.out.println(c);
		
	}

}
