package zhangtongtong;

public class Ball {

	//一球从一百米高度自由落下，每次落地后反跳回原高度的一半
	//再落下，求它在第10次落地时，共经过多少米？第n次反弹多高？
	public static void main(String[] args) {
		double h = 100;
		double h1 = h/2;
		int i = 0;
		for(i = 2;i<10;i++){
			h = h + h1*2;
			h1 = h1/2;
		}
		System.out.println("第"+i+"次落地经过"+h+"米");
		System.out.println("第"+i+"次反弹"+h1+"米");
	}
	
}
