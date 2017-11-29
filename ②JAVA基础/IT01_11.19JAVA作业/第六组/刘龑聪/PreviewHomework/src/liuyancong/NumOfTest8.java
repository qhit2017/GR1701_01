package liuyancong;
/*×÷Õß£ºÁõıŒ´Ï
  E-mail£º15539919713@163.com
 */
public class NumOfTest8 {
	public static void main(String[] args) {
		int i = 0;
		for (int a = 100; a < 1000; a++) {
			if ((a % 10 == 6) && (a % 3 == 0)) {
				i++;
				System.out.print(a+"\t");
				if(i%6==0){
					System.out.println();
				}
			}
		}
	}
}