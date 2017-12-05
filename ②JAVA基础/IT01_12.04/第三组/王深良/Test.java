import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		ArrayList<Kaoshen> arrayList = new ArrayList<Kaoshen>();

		Scanner sc = new Scanner(System.in);

		ScoreFenshu scoreFenshu = new ScoreFenshu();

		scoreFenshu.in();

		boolean b = true;

		while (b) {
			int s = sc.nextInt();

			switch (s) {
			case 1:
				scoreFenshu.addFenshu(arrayList, sc);
				System.out.println("请输入下一条指令");
				break;
			case 2:
				scoreFenshu.infoFenshu(arrayList);
				System.out.println("请输入下一条指令");
				break;

			case 3:
				scoreFenshu.info();

				boolean b1 = true;
				while (b1) {
					int s1 = sc.nextInt();
					switch (s1) {
					case 1:
						scoreFenshu.setMAXFenshu(arrayList, "总成绩");
						break;
					case 2:
						scoreFenshu.setMAXFenshu(arrayList, "语文");
						break;
					case 3:
						scoreFenshu.setMAXFenshu(arrayList, "数学");
						break;
					case 4:
						scoreFenshu.setMAXFenshu(arrayList, "英语");
						break;
					case 5:
						scoreFenshu.in();
						b1 = false;
						break;

					default:
						System.out.println("输入有误");
						break;
					}
				}
				break;

			case 4:
				b = false;
				break;

			default:
				System.out.println("输入有误");
				break;
			}
		}
		System.out.println("再见");
	}

}
