/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��12��13�� ����6:53:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class WuWeiShu {
	public static void main(String[] args) {
		int j=0;
	for (int i = 10000; i < 100000; i++) {
		if (i%10==6&&i%3==0) {
			System.out.println(i);
			j++;
		}
		
	}System.out.println("����Ϊ"+j);	
		
		
		
	}

}
