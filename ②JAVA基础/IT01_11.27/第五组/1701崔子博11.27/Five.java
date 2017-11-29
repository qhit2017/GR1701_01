import java.util.Scanner;


public class Five {
	public static void main(String[] args) {
		
		//从键盘输入10ge数，将第二个与地六个交换，
		//第四个与第八个交换 输出原来的10个数输出叫唤后的10个数
		
		Scanner sc = new Scanner(System.in);
		
		int a[]= new int [10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入"+(i+1)+"个数");
			a[i]=sc.nextInt();
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[1]!=a[5]) {
					int t = a[1];
					a[1]=a[5];
					a[5]=t;
				}
				if (a[3]!=a[7]) {
					int t=a[3];
					a[3]=a[7];
					a[7]=t;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
	}

}
