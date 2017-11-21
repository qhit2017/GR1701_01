package whh;

public class sever {
	public static void main(String[] args) {
	
		
		int i = 1;
		int sum = 0;
		
		do {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.print(i + "\t");
				sum += 1;
				
				if (sum % 6 == 0) {
					System.out.println();
				}
			}

			i++;
		} while (i <= 1000);
	}	

}
