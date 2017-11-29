import java.util.Scanner;

public class HomeWorkFour {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数");
		int a = sc.nextInt();

		switch (a) {
		case 1:System.out.println("星期1");break;
		case 2:System.out.println("星期2");break;
		case 3:System.out.println("星期3");break;
		case 4:System.out.println("星期4");break;
		case 5:System.out.println("星期5");break;
		case 6:System.out.println("星期6");break;
		case 7:System.out.println("星期7");break;

		default:System.out.println("输入错误");
			break;
		}
	}

}
