package wangshenliang;

public class Name {
	public static void main(String[] args) {
		int i = 0;
		for (int a = 100; a < 1000; a++) {
			if ((a % 10 == 6) && (a % 3 == 0)) {
				i++;
				System.out.print(a+"\t");
				if(i%5==0){
					System.out.println();
				}
			}
		}
	}
	

}
