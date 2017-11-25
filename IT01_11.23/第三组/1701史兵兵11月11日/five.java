package job;

public class five {
	// 5 用for 和 while两种方法计算1~100之间奇数的和
	public static void main(String[] args) {
		int a = 0;
		for (int b = 1; b <= 100; b++) {
			if (b % 2 != 0) {
				a += b;

			}
		}
		System.out.println(a);
		
		
		
		
		
	    int c=0;
		int d=1;
		while(d<=100){
			if(d%2!=0){		
				c+=d;}
				d++;
				
			
		}System.out.println(c);

	}

}
