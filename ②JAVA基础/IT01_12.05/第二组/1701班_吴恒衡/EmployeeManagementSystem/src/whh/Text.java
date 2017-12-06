package whh;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:2421922506@QQ.com
 * @date    创建时间：2017年12月5日 下午8:42:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Text {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		ArrayService  array = new ArrayService();
		array.info();
		String s;
		boolean isquit = true;
		while (isquit) {
			s = sc.next();
			switch (s) {
			case "Add":
				
				array.addArray(arrayList, sc);
				break;
			case "Remove":
				
				break;
			case "Set":
		
				break;
			case "Find":
		
				break;
			case "Exit":
				isquit = false;
				break;
			

			default:
				break;
			}
		}
		
	}

}
