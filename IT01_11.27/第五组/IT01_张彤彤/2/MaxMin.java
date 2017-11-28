package com.ztt;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2017年11月28日 下午7:42:16
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 5, 9, 12, 45, 18, 30 };

		int Max = a[0];

		int Min = a[0];

		int Sum = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > Max) {

				Max = a[i];
			}

			if (a[i] < Min) {

				Min = a[i];
			}

			Sum += a[i];
		}

		System.out.println("最大值是：" + Max);

		System.out.println("最小值是：" + Min);

		System.out.println("总和是：" + Sum);
	}

}
