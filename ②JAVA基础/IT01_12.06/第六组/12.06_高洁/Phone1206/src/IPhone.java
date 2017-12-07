import java.util.ArrayList;
import java.util.Scanner;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年12月6日 下午5:51:03
 */
public interface IPhone {

	void info();

	void addPhone(ArrayList<Phone> arrayList, Scanner sc);

	void infoPhone(ArrayList<Phone> arrayList);

	ArrayList<Phone> findsex(ArrayList<Phone> arrayList);

	Phone findname(ArrayList<Phone> arrayList);

	Phone findphoneNumber(ArrayList<Phone> arrayList);

}
