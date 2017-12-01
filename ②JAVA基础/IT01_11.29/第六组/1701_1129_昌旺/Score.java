/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月29日 上午8:36:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package changwang;

import java.util.Arrays;

public class Score implements IScore {

	@Override
	public void info() {
		System.out.println("-----成绩查询系统-----");
		System.out.println("[1]求和输入sum");
		System.out.println("[2]最大值输入max");
		System.out.println("[3]最小值输入min");
		System.out.println("[4]平均值输入average");
		System.out.println("[5]不及格人数请输入not");
		System.out.println("[6]退出请输入Exit");
		System.out.println("[7]由小到大排序请输入ppp");

	}

	@Override
	public double sum(double[] a) {
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			c += a[i];
		}

		return c;
	}

	@Override
	public double max(double[] a) {
		double max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	@Override
	public double min(double[] a) {
		double min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	@Override
	public double average(double[] a) {
		int av = 0;
		for (int i = 0; i < a.length; i++) {
			av += a[i];
		}
		return av;
	}

	@Override
	public double not(double[] a) {
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 60) {
				x++;
			}
		}
		return x;
	}

	public double[] ppp(double[] a) {
		double n = 0;
		for (int j = 0; j < a.length - 1; j++) {

			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					n = a[i];
					a[i] = a[i + 1];
					a[i + 1] = n;
				}
			}
		}System.out.println(Arrays.toString(a));
		return a;
	}
}
