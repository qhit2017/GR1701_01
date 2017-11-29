package zhangqing;

public class TestFor {

	public static void main(String[] args) {
		//
		int sum=0;
		
		for(int a=1;a<=100;a++){
			sum +=(a % 2 != 0)? a :0;
			
		}
		System.out.println("1~100的奇数的和为"+sum);
	}
}
