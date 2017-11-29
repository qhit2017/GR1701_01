
public class Test10 {
	
	public static void main(String[] args) {
	 int o = 1;
	 while (o<=9) {
		int u = 1;
		while (u<=o) {
			System.out.print(u+"*"+o+"="+o*u+"\t");
			u++;
		}
		System.out.println();
		o++;
	}
	}

}
