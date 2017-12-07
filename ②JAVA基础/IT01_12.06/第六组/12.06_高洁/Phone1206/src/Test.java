import java.util.ArrayList;
import java.util.Scanner;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年12月6日 下午5:53:01
 */
public class Test {
	public static void main(String[] args) {
		PhoneSerrice phoneSerrice = new PhoneSerrice();
		Scanner sc = new Scanner(System.in);
		ArrayList<Phone> arrayList = new ArrayList<Phone>();

		phoneSerrice.info();

		boolean b = true;
		while (b) {
			int i1 = sc.nextInt();
			switch (i1) {
			case 1:
				phoneSerrice.addPhone(arrayList, sc);
				break;
			case 2:
				phoneSerrice.infoPhone(arrayList);
				break;
			case 3:
				phoneSerrice.findsex(arrayList);
				break;
			case 4:
				phoneSerrice.findname(arrayList);
				break;
			case 5:
				phoneSerrice.findphoneNumber(arrayList);
				break;
			case 6:
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
