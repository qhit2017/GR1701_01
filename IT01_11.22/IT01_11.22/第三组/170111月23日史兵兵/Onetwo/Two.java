package Onetwo;

public class Two {
	public static void main(String[] args) {
		//输出乘法口诀表
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				
			}System.out.println();
			
		}
		
		int a=1;
		while (a<=9) {
			int b=1;
			while (b<=a) {
				System.out.print(a+"*"+b+"="+a*b+"\t");
				b++;
				
			}
			System.out.println();
			a++;
		
			
		}
	}

}
