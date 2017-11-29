package three;

public class ZUOYE {
	public static void main(String[] args) {
		//编写JAVA程序，求1000以内，既能被5整除，又能被3整除的所有整数；并打印出来。（使用do while循环实现）
		/**int a=0;
		do{a%5==0 && a%3==0;
		a++;
		}while(a<=1000);
		System.out.println(a);
		
			*/
			
			for(int a=1;a<=1000;a++){
				if(a%5==0 && a%3==0){
					System.out.println(a);
				}
			}
			
			
			
			
			
			
			
			
			
			
		}
	}


