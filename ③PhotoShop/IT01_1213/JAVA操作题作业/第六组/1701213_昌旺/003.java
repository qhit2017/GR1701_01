/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��13�� ����7:19:43 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package cc;

public class Disanti {

	public static void main(String[] args) {
		int unm=0;
		for (int i =10000; i <100000; i++) {
			if (i%10==6 && i%3==0) {
				System.out.println(i);
				unm++;
			}
		}
		System.out.println(unm);

	}

}
