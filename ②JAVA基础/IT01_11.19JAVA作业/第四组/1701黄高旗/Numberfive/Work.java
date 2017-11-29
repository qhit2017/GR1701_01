package five;
/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月19日 下午8:05:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work {
	public static void main(String[] args) {
		/**编程java程序，从1，2，3，4，5这五个数任意取出两个
		 * 数，列出他们所有组合并且输出到屏幕上。
		 */
		for(int a =1;a<=5;a++){
			for(int b=1;b<=5;b++){
				if(a!=b){
					System.out.print(a);
					System.out.println(b);
					
				}
			}
		}
	}

}
