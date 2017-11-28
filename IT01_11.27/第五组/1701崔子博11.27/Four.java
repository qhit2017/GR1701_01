import java.util.Scanner;


public class Four {
	
	public static void main(String[] args) {
		//4 从键盘输入10个数，并从大到小排序
		
		Scanner sc = new Scanner(System.in);
		
		int a[]=new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入"+(i+1)+"个数");
			
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					int t =a[i];
					 a[i]=a[j];
					 a[j]=t;
				}				
			}			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print("   "+a[i]);
		}
		
		
		
		
	}

}
