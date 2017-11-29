package yangchong;

public class Six {
	
	public static void main(String[] args) {
		

		int a=0;
		
		for(int b=1;b<=10;b++){
			
			a=a+b;
			
			if(a>20){
				System.out.println("数为"+b+"累加值大于20");
				break;
			}
		}
	}

}
