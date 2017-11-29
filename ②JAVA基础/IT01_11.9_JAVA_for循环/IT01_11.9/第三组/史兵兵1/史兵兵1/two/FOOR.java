package two;
/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月9日 下午8:19:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class FOOR {
	public static void main(String[] args) {
		//2.打印九九乘法表
		for(int a=1;a<=9;a++){
			for(int b=1;b<=a;b++){
				System.out.print(a+"*"+b+"="+a*b+"\t");
			}System.out.println();
		}
	
}

}
