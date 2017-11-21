package wangshenliang;

import java.util.Scanner;

/** 
 * @author  作者 王深良E-mail:793708547@QQ.com
 * @date    创建时间：2017年11月21日 下午8:22:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class For {
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
