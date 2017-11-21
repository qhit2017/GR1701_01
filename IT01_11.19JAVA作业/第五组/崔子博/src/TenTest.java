
public class TenTest {
	public static void main(String[] args) {
		
/*		for(int a=1;a<=9;a++){
			for(int b=1;b<=a;b++){
				System.out.print(a+"*"+b+"="+(a*b)+"\t");
			}
			System.out.println();
		}*/
		
		
		
		int a=1;
		
		while(a<=9){
			int b=1;
			while(b<=a){
				System.out.print(b+"*"+a+"="+a*b+"\t");
				b++;
			}
			System.out.println();
			a++;
		}
		
		
	}

}
