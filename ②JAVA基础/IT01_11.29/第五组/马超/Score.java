package Grade;

import java.util.Arrays;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月29日 上午9:31:18
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Score implements Iscore {
	@Override
	public void info() {
		System.out.println("-----成绩管理系统帮助-----");
		System.out.println("[1]求和请输入Sum");
		System.out.println("[2]最大值请输入Max");
		System.out.println("[3]最小值请输入Min");
		System.out.println("[4]平均请输入Average");
		System.out.println("[5]排序请输入Sort");
		System.out.println("[6]不及格人数请输入Not");
		System.out.println("[7]查看全部成绩请输入info");
		System.out.println("[8]退出请输入Exit");
        System.out.println();
	}

	@Override
	public double[] Sort(double[] d) {
		  for (int i = 0; i < d.length-1; i++) {
			for (int j = 0; j < d.length-1; j++) {
				if (d[j]<d[j+1]) {
					double temp=d[j+1];
					d[j+1]=d[j];
					d[j]=temp;
				}
			}
			return d;
		}
		return d;
	}
	@Override
	public int numberNot60(double[] d) {
           int not=0;
           for (int i = 0; i < d.length; i++) {
			if (d[i]<60) {
				not++;
			}
		}
		
		return not;
	}

	@Override
	public double Sum(double[] d) {

		int sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum;
	}

	@Override
	public double Max(double[] d) {
		double Max = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] > Max) {
				Max = d[i];
			}
			return Max;
		}
		return Max;
	}

	@Override
	public double Min(double[] d) {
		double Min = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] > Min) {
				Min = d[i];
			}
			return Min;
		}
		return Min;
	}	

	@Override
	public double Average(double[] d) {
		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum/d.length;
	}	
	void ScoreInfo(double []d){
		System.out.println(Arrays.toString(d));
	}

	public void help() {
		// TODO Auto-generated method stub
		
	}
}
