package job;
/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月28日 下午6:58:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class job20 {
	public static void main(String[] args) {
		//定义一个整型数组{5,9,12,45,18,30}，要求打印
		//出数组中所有元素之和，并打印出最大值和最小值。
		int []a={5,9,12,45,18,30};
		int sum=0;
		int max=a[0];
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			if (a[i]>max) {
				max=a[i];
				
			}
			if (a[i]<min) {
				min=a[i];
				
			}
		}
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
	}

}
