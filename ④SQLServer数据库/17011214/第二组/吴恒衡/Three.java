package whh;

public class Three {
	public static void main(String[] args) {
		double sum =0;
		int a=100;
		for (int i = 1; i <11; i++) {
			sum+=a+a/2;
			a=a/2;
		}
		System.out.println(sum);
	}

}
