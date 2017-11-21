package glh;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ZuoYe_4 {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int a = 1;a <= 1000;a++){
			if(a%8==0){
				sum+=a;
			}
		}
		System.out.println(sum);
	
	}

}
