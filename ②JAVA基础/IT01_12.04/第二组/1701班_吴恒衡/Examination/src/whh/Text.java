package whh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 作者 E-mail:2421922506@QQ.com
 * @date 创建时间：2017年12月4日 上午9:53:35
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Text {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Study> arrayList = new ArrayList<Study>();
		ScoreService scoreService = new ScoreService();
		boolean isquit = true;
		boolean ishelp = false;
		String s;
		String a;
		scoreService.info();
		while (isquit) {
			s = sc.next();
			switch (s) {
			case "1":
				scoreService.addStudy(arrayList, sc);

				break;
			case "2":
				scoreService.infoStudy(arrayList);
				break;
			case "3":
				ishelp  = true;
				scoreService.help();
				while (ishelp) {
					a =sc.next();
					switch (a) {
					case "1":
						
						System.out.println(scoreService.maxstudy(arrayList, "总成绩"));
						
						break;
					case "2":
						System.out.println(scoreService.maxstudy(arrayList, "语文"));
						break;
					case "3":
						System.out.println(scoreService.maxstudy(arrayList, "数学"));
						
						break;
					case "4":
						System.out.println(scoreService.maxstudy(arrayList, "英语"));
						break;
					case "5":
						ishelp = false;
					  break;

					default:
						break;
					}
					
				}

				break;
			case "4":
				isquit = false;
				break;

			default:
				break;
			}
		}
	}

}
