package whh



public class Five {
	public static void main(String[] args) {
		String a = null;
		long b=13;
		
		for (int i = 0; i < 11; i++) {
			
			
			b=b*13;
		} 
		a=b+" ";
		System.out.println(a);
	   System.out.println(a.length());
	   
	   for (int i = a.length()-4; i < a.length(); i++) {
		System.out.println(a.charAt(i));
	}
	}

}
