
public class Second {
	
	public static void main(String[] args) {
		
		//2 定义一个整型数组{5,9,12,45,18,30}，要求打印出数组中所有元素之和，并打印出最大值和最小值。
		
		int []a= {5,9,12,45,18,30};
		int sum=0;
		int max=a[0];
		int main=a[0];
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			if (max<a[i]) {
				max=a[i];
			}
			if (main>a[i]) {
				main=a[i];
			}
		}
		System.out.println(sum);
		System.out.println(max);
		System.out.println(main);
		
	}

}
