import java.util.Scanner;


public class OneTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		
		int a = sc.nextInt();
		
		if(a>0){
			System.out.println("正数");
	}if(a<0){
		System.out.println("负数");
	}
	}
}
