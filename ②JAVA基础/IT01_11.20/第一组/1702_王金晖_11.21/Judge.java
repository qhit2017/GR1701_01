import java.util.Scanner;


public class Judge {
     public static void main(String[] args) {
		//第四题
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("输入一个5位数");
    	 int t = sc.nextInt();
    	 
    	if(t/10000==t%10 && t/1000%10==t/10%10 ){
    		System.out.println(t+"该数是回文数");
    			
    		}else{
    			System.out.println(t+"该数不是回文数:");
    			
    		}
    	
    	
	}
}
                                                                                                                                                                                                                                                                      