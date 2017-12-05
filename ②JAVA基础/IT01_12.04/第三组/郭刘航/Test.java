package ExamSystem;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		ScoreService service = new ScoreService();
		Scanner sc = new Scanner(System.in);
		boolean isQuit = true;
		boolean isSubQuit = false;
		int key = 0;
		service.helpInfo();
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				service.addScore(arrayList, sc);
				break;

            case 2:
				service.infoScore(arrayList);
				break;
				
            case 3:
				service.helpSubInfo();
				isSubQuit = true;
				while (isSubQuit) {
					key = sc.nextInt();
					switch (key) {
					case 1:
						service.getMax(arrayList, "总成绩");
						break;

					case 2:
						service.getMax(arrayList, "语文");
						break;
						
					case 3:
						service.getMax(arrayList, "数学");
						break;
						
					case 4:
						service.getMax(arrayList, "英语");
						break;
						
					case 5:
						isSubQuit = false;
						service.helpInfo();
						break;
					default:
						break;
					}
				}
				break;
				
            case 4:
				isQuit = false;
				break;
				
			default:
				break;
			}
		}
	}
}
