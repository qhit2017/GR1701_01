package shangpin;

import java.util.ArrayList;
import java.util.Scanner;

public interface IShangPin {
	void helpInfo();
	//增加
	void addShangPin(ArrayList<ShangPin> arrayList,Scanner sc);
	//进货
	void stockShangPin(ArrayList<ShangPin> arrayList,Scanner sc);
	//销售
	void sellShangPin(ArrayList<ShangPin> arrayList,Scanner sc);
	//查询
	void infoShangPin(ArrayList<ShangPin> arrayList,Scanner sc);
	

}
