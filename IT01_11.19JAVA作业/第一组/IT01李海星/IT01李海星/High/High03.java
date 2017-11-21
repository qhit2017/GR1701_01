
public class High03 {
	public static void main(String[] args) {
		// 3 一球从h米高度自由落下，每次落地后反跳回原高度的一半；
		// 再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？

		double h = 100;

		double h_1 = h / 2;

		int i = 0;

		for (i = 2; i < 10; i++) {
			h = h + h_1 * 2;
			h_1 = h_1 / 2;

		}
		System.out.println(  i + "次落地经过" + h + "米");
		System.out.println("第" + i + "次反弹" + h_1 + "米");

	}

}
