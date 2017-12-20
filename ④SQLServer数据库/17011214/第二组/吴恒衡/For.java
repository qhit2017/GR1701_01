package whh;

public class For {
	public static void main(String[] args) {
		for (int i = 1000; i <10000; i++) {
			if((i%100+i/100)*(i%100+i/100)==i)
				System.out.println(i);
		}
	}

}
