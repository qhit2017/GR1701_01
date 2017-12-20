/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年12月13日 下午6:53:06 
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
		
	}System.out.println("总数为"+j);	
		
		
		
	}

}
