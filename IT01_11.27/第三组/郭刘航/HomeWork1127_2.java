package GLH;
/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class HomeWork1127_2 {

	public static void main(String[] args) {
		
		//定义一个整型数组{5,9,12,45,18,30}，要求打印出数组中所有元素之和，并打印出最大值和最小值。
		int []a = {5,9,12,45,18,30};
		int sum = 0;
		
		int max = a[0];
		int min = a[0];
		
		for (int x = 0;x < a.length;x++){
			if (a[x] > max){
				max = a[x];
			}
			if (a[x] < min){
				min = a[x];
		}
		}
		System.out.println(max);
		System.out.println(min);
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
