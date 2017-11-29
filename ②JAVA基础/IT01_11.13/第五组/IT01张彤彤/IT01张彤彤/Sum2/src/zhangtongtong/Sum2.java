package zhangtongtong;

public class Sum2 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int a = 1;a<=10;a++){
			
			if(a==3){
				
				continue;
			}
			sum +=a;
		}
		for(int a = 11;a<=100;a++){
			
			if(a%10==3){
				
				continue;
			}
			sum +=a;
		}
		System.out.println(sum);
	}
}
