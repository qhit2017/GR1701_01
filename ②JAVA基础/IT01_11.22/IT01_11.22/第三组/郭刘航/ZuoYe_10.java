package glh;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月22日 下午8:30:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ZuoYe_10 {
     public static void main(String[] args) {
    	 int a = 1;
 		while(a <= 9){
 			int b=1;
 			while(b <= a){
 				System.out.print(b+"*"+a+"="+a*b+"\t");
 				b++;
 }
 			System.out.println();
 			a++;
	}
              System.out.println();
     for(int i=1;i<=9;i++){
    	 for(int j=1;j<=i;j++){
    		 System.out.print(j+"*"+i+"="+i*j+"\t");
    	 }
    	 System.out.println();
     }
}
}