/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年12月12日 下午4:42:29
 */
public class Test4 {
	public static void main(String[] args) {
		// 4. 一个球从100m高度自由落地，每次落地后反跳回原高度的一半，在落下，再反弹。求它在第10次落地时，共经历多少米？

		double h = 100;

		double sum = 0;
		for (int i = 1; i < 10; i++) {

			h = h / 2;
			sum += h * 2;
		}
		System.out.println(h);
		System.out.println(sum + 100);
	}
}
