package whh;

public class seven {
	public static void main(String[] args) {
		for (int i = 1000; i <10000; i++) {
			for (int k = 1; k < 100; k++) {
				if(i%1000==i/10%100&&i/1000==i/100%10&&i==k*k)
					System.out.println(i);
			}
			
		}
	}

}
