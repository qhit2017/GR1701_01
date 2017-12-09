package whh;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:2421922506@QQ.com
 * @date    创建时间：2017年12月7日 下午2:28:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface ICommodity {
	void helpInfo();
	void addCommodity(ArrayList<Commodity> arrayList,Scanner sc);
	void findCommodity(ArrayList<Commodity> arrayList,Scanner sc);
	void sellCommodity(ArrayList<Commodity> arrayList,Scanner sc);
	void lookCommodity(ArrayList<Commodity> arrayList);
}
