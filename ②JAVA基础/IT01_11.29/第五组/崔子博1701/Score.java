import java.util.Arrays;


public class Score implements IScore {

	private int j;

	@Override
	public void info() {
		System.out.println("-----成绩管理系统帮助-------");
		System.out.println("[1]求和请输入sum");
		System.out.println("[2]求最大值请输入max");
		System.out.println("[3]求最小值请输入min");
		System.out.println("[4]求平均值请输入average");
		System.out.println("[5]排序请输入sort");
		System.out.println("[6]不及格人数请输入not");
		System.out.println("[7]查看全部成绩请输入info");
		System.out.println("[8]退出系统请输入exit");
	}

	@Override
	public double sum(double[] b) {
		
		int sum=0;
		for (int i = 0; i < b.length; i++) {
			sum+=b[i];
		}
		return sum;
	}

	@Override
	public double average(double[] b){
		int average =0;
		int sum=0;
		for (int i = 0; i < b.length; i++) {
			sum+=b[i];
	}		
		
		average=sum/(b.length);
		return average;
	}

	@Override
	public double[] sort(double[]b) {
		
		for (int i = 0; i < b.length-1; i++) {
			for (int j = 0; j < b.length-1; j++) {
				if (b[i]>b[j+1]) {
					double sort = b[i];
					b[i]=b[j+1];
					b[j+1]=sort;
					 
				}
			}
		}
		
		return b;
	
}
	@Override
	public double min(double[] b) {
		double min=100;
		for (int i = 0; i < b.length; i++) {
			if (b[i]<min) {
				min=b[i];
			}
		}
		
		return min;
	}

	@Override
	public double max(double[] b) {
		double max=0;
		for (int i = 0; i < b.length; i++) {
			if (b[i]>max) {
				max=b[i];
			}
		}
	
	
		return max;
	}

	@Override
	public double notnumber(double[] b) {
		int count = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i]<60) {
				count++;
			}
		}
		
		return count;
	}

	public double info(double[] d) {
		for (int i = 0; i < d.length; i++) {
			
		}
		
		
		return 0;
	}
	
	void scoreInfo(double[]d){
		System.out.println(Arrays.toString(d));
	}

}
