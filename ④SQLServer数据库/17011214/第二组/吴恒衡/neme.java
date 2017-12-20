package whh;

public class neme {
	public static void main(String[] args) {
		int n=2;
		int m=1;
		for (int i = 0; i < 20; i++) {
			double a=n/m;
			n=m+n;
			m=m+2;
			if (i==19) {
				System.out.println(a);
			}
		}
		
		
	}

}
