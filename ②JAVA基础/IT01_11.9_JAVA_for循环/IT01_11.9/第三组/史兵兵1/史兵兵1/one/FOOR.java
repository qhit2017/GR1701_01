package one;
/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月9日 下午8:15:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class FOOR {
	public static void main(String[] args) {
	/**	1. 打印出100到1000的所有的"水仙花数" 。
		(所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
				例如：153是一个"水仙花数"，因为153=1的三次方＋5的三
				次方＋3的三次方。)*/
		int bai=0;
		int shi=0;
		int ge=0;
		for(int i=100;i<=1000;i++){
			bai=i / 100;
			shi=i/ 10 % 10;
			ge=i % 10;
			if(i==bai*bai*bai+shi*shi*shi+ge*ge*ge){
				System.out.println("水仙花数："+i);
			}
	
			
			
			
			
		}
			
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
