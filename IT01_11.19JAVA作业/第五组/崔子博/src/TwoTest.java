import java.util.Scanner;


public class TwoTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入a");
		
		double a = sc.nextDouble();
		System.out.println("请输入b");
		double b = sc.nextDouble();

		
		if(a>b){
			System.out.println("a大于b");
		}if(a<b){
			System.out.println("a小于b");
		}
		
	}

}
