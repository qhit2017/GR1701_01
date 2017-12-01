package Grade;

import java.util.Scanner;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月29日 上午8:56:47
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("你将对几个学生成绩进行管理？");
		int n = sc.nextInt();
		double[] d = new double[n];
		for (int i = 0; i < d.length; i++) {
			System.out.print("请输入第" + (i + 1) + "个成绩：");
			double s = sc.nextDouble();
			d[i] = s;
		}

		Score score = new Score();
		boolean isExit = true;
		score.help();
		while (isExit) {

			System.out.println("请输入指令并按回车键进行下一项指令");
			String k = sc.next();

			switch (k) {

			case "Help":
				score.help();
				break;
			case "Max":
				System.out.println(score.Max(d));
				System.out.println();
				break;
			case "Min":
				System.out.println(score.Min(d));
				System.out.println();
				break;
			case "Sum":
				System.out.println(score.Sum(d));
				System.out.println();
				break;
			case "Average":
				System.out.println(score.Average(d));
				System.out.println();
				break;
			case "numberNot60":
				System.out.println(score.numberNot60(d));
				System.out.println();
				break;
			case "sort":
				System.out.println(score.Sort(d));
				System.out.println();
				break;
			case "Exit":
				isExit = false;
				break;

			default:
				System.out.println("请输入正确的指令!");
				System.out.println();
				break;
			}
		}
		System.out.println("再见了,我的朋友");

	}

}
