import java.util.Scanner;


public class Week {
	public static void main(String[] args) {
		int num=0;
		String day="";
		Scanner a = new Scanner(System.in);
		System.out.println("输入数字1至7(输入0结束):");
		num=a.nextInt();
		do {
			switch (num) {
			case 0:
				break;
				
			case 1:
				day="今天是星期一";
				System.out.println(day);
				break;
			case 2:
				day="今天是星期二";
				System.out.println(day);
				break;
			case 3:
				day="今天是星期三";
				System.out.println(day);
				break;
			case 4:
				day="今天是星期四";
				System.out.println(day);
				break;
			case 5:
				day="今天是星期五";
				System.out.println(day);
				break;
			case 6:
				day="今天是星期六";
				System.out.println(day);
				break;
			case 7:
				day="今天是星期天";
				System.out.println(day);
				break;
			default:
				System.out.println("请重新输入,");
				break;
			}
			num=a.nextInt();
		} while (num!=0);
		
	}

	
}
