import java.util.Scanner;


public class Three {
	public static void main(String[] args) {
		
		
		//3 从键盘输入10个数，输出后5个数
		
		Scanner sc = new Scanner(System.in);
		
		int []a=new int [10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入"+(i+1)+"个数");
			
			a[i]=sc.nextInt();
			System.out.println();
			
		}
		for (int i = 5; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
		
		
	}

}
