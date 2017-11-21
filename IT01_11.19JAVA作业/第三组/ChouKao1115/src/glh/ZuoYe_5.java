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
public class ZuoYe_5 {
	public static void main(String[] args) {
		//求1000以内既能被5整除又能被3整除的所有整数
		int a = 1;
		do{
			if(a%3==0&&0==a%5){
				System.out.println("1000以内既能被5整除又能被3整除的整数:"+a);
			}
			a++;
		}
			while(a<=1000);


}
}
