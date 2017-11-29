package gaojie;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月8日 下午4:43:17
 */
public class Multiplication1109 {
	public static void main(String[] args) {
		
		System.out.println("九九乘法表：\n");
		
		for (int i = 1; i <= 9; i++) {
			
			for (int g = 1; g <= i; g++) {
				System.out.print(i + "*" + g + "=" + i * g + "\t");
			}
			
			System.out.println();
			
		}
	}
}
