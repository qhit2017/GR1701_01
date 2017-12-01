.package jhb;

import java.util.Arrays;


public class ScoreImplment implements Score {

	@Override
	public  void help() {
		System.out.println("---分数管理系统帮助信息---");
		System.out.println("【0】求平均值请输入Average");
		System.out.println("【1】求总分请输入Sum");
		System.out.println("【2】求最大值请输入Max");
		System.out.println("【3】求最小值请输入Min");
		System.out.println("【4】求不及格人数请输入Not");
		System.out.println("【5】退出请输入Quit");
		System.out.println("【6】浏览各科成绩请输入Info");
		System.out.println("【7】按升序排列成绩请输入Sort");
	}

	@Override
	public int getAverage(int[] a) {
		
		
		return getSum(a)/a.length;
	}

	@Override
	public int getSum(int[] a) {
		if(a.length>Score.NUMBER){
			System.out.println("您输入的个数有误，请重新输入");
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		
		return sum;
	}

	@Override
	public int getMax(int[] a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMin(int[] a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNot60(int[] a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void info(int[] a) {
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	@Override
	public int[] sort(int[] a) {
		//冒泡法排序
		//{58,66,79,89,22,99,65,36,95,77};
		//{58,66,79,22,89,99,65,36,95,77};
		//{58,66,79,22,89,65,36,95,77,99};
		
	    //{58,66,22,79,65,36,89,77,95,99};
		boolean isSort;
		int temp;
		for (int j = 0; j < a.length-1; j++) {
			isSort = true;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i]>a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					isSort = false;
				}
			}
			
			if(isSort){
				break;
			}
			System.out.println(Arrays.toString(a));
		}

		int b[] = a;
		return a;
	}

}
