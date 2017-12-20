package test;
/*Author£ºÁõıŒ´Ï
  E-mail£º15539919713@163.com
 */
public class Test03 {
	public static void main(String[] args) {
		int j = 0;
		for (int i = 10000; i < 100000; i++) {
			String s = i + "";
			if ((s.charAt(4)=='6')&&(i%3==0)) {
				j++;
			}
		}
		System.out.println(j+"¸ö");
	}
}
