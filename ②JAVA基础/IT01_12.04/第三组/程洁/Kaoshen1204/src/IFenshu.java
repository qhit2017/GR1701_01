import java.util.ArrayList;
import java.util.Scanner;

public interface IFenshu {

	// 菜单
	void in();

	// 增加
	void addFenshu(ArrayList<Kaoshen> arrayList, Scanner sc);

	// 显示
	void infoFenshu(ArrayList<Kaoshen> arrayList);

	// 最大值

	double setMAXFenshu(ArrayList<Kaoshen> arrayList, String subject);
}
