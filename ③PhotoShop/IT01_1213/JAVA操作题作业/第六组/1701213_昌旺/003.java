/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月13日 下午7:19:43 
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
