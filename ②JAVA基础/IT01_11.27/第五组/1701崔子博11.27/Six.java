import java.util.Arrays;


public class Six {

	public static void main(String[] args) {
		
		int []a= {11,88,55,66,44,99,33,77,100,22};
		for (int i = 0; i < a.length-1; i++) {
		
			for (int j =i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int t= a[i];
					a[i]=a[j];
					a[j]=t;
					
					
				} 
			}
			System.out.println(Arrays.toString(a));
		}
	}
}
