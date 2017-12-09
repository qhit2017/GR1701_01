/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月7日 下午3:43:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package zk.qhit.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShangpinServer sps = new ShangpinServer();
		ArrayList<Shangpin> as = new ArrayList<>();
		boolean isqq=true;
		sps.help();
		while (isqq) {
			int a=sc.nextInt();
			switch (a) {
			case 1:
				sps.addShangpin(as, sc);
				break;
			case 2:
				sps.jinhuoShangpin(as, sc);
				break;
			case 3:
				sps.chushoupin(as, sc);
				break;
			case 4:
				sps.infoShangpin(as);
				break;
			case 5:
				isqq=false;
				break;

			default:
				System.out.println("请输入正确指令");
				break;
			}
			
		}

	}

}
