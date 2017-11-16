package wangshenliang;
/** 
 * @author  作者 王深良E-mail:793708547@QQ.com
 * @date    创建时间：2017年11月14日 下午7:18:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Perfec {
	
	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {

			int tem = 0;

			for (int j = 1; j < i; j++) {

				if (i % j == 0) 

					tem += j;
			}

			if (tem == i) {

				System.out.println(i);

			}
		}
	}

}
