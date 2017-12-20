package test;
/*Author：刘龑聪
  E-mail：15539919713@163.com
 */
public class Test04 {
	public static void main(String[] args) {
		
		double j = 100;

		double s = 100;
		for (int i = 2;i<=10; i++) {
			j = j/2;
			s += j*2;
		}
		System.out.println("共经历了"+s+"m");
	}
}
