/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月7日 下午2:27:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package zk.qhit.com;

import java.util.ArrayList;
import java.util.Scanner;

public interface IShangpin {
	void help();
	
	void addShangpin(ArrayList<Shangpin> arrayList,Scanner sc);
	
	void jinhuoShangpin(ArrayList<Shangpin> arrayList,Scanner sc);
	
    void chushoupin(ArrayList<Shangpin> arrayList,Scanner sc);
	
	void infoShangpin(ArrayList<Shangpin> arrayList);

}
