package six;
/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月19日 下午8:14:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work {
	public static void main(String[] args) {
		//编写Java程序，求个位数为6且能被3整除的三位整数共有多少
		int a=0;
		for(int b=100;b<1000;b++){
			if(b % 10==6 && b%3==0){
				System.out.println(b+"");
				a++;
			}
		}
		System.out.println("三位数共有："+a);
	}

}
