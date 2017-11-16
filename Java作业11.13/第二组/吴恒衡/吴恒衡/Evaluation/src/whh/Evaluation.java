package whh;
/** 
 * @author  作者 E-mail:2421922506@QQ.com
 * @date    创建时间：2017年11月14日 下午7:04:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Evaluation {
	public static void main(String[] args) {

		int a = 0;
		for(int b = 1;b<=100;b++){
			if(b%10==3){
				continue;
			}
			a+=b;
			
			
		}System.out.println(a);
		
	}

}
