import java.util.Arrays;

/** 
 * @author  作者 E-mail:271406@163.com
 * @date    创建时间：2017年11月27日 下午6:48:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Paixun {public static void main(String[] args) {
	int []a={23,56,98,87,36,54,39,25,45,33,};
	int temp;
	for (int j = 0; j < a.length-1; j++) {
		
	
	for (int i = 0; i < a.length-1; i++) {
if (a[i]<a[i+1]) {
	temp=a[i];
	a[i]=a[i+1];
	a[i+1]=temp;
	
}
		
		
	}
	}System.out.println(Arrays.toString(a));
}

}
