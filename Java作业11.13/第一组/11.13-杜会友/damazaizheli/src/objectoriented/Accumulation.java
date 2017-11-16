package objectoriented;

public class Accumulation {
	//5、求整数1~100的累加值，
	//但要求跳过各位为3的数
public static void main(String[] args) {
	
	int shuo = 0;
	for (int leijazhi = 1; leijazhi < 101; leijazhi ++ ) {
		if(leijazhi%10==3)
			continue;
		shuo += leijazhi;
		
	}
	System.out.println(shuo);
	}
}	
		
		
	
			
				
			

	
	

