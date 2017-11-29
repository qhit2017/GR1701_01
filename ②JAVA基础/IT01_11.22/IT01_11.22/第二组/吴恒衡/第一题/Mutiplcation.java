package whh;

public class Mutiplcation {
	public static void main(String[] args) {
		/*for (int i = 1; i<=9; i++) {
			for (int j =1; j <= i; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}System.out.println();
			
		}*/
		int i = 1;
		while (i<=9) {
			int j = 1;
			while (j<=i) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;	
				
			}System.out.println();
			i++;
			
		}
		
	}

}
