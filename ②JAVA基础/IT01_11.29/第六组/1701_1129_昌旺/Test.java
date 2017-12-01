/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月29日 上午8:55:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package changwang;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Score score = new Score();
		double[] a = { 65, 43, 72, 86, 41, 75, 66, 90, 78 };
		score.info();
		Scanner sc = new Scanner(System.in);
		boolean isQ = true;
		String s;
		while (isQ) {
			s = sc.next();
			switch (s) {
			case "sum":

				double sco = score.sum(a);
				System.out.println(sco);
				break;
			case "max":
				double mx = score.max(a);
				System.out.println(mx);
				break;
			case "min":
				double mi = score.min(a);
				System.out.println(mi);
				break;
			case "average":
				double aver = score.sum(a);
				System.out.println(aver / a.length);
				break;
			case "Exit":
				isQ = false;
				break;
			case "not":
				double not = score.not(a);
				System.out.println(not);
				break;
			case "ppp":
				score.ppp(a);
				
				break;

			}
		}

		System.out.println("再见");

	}

}
