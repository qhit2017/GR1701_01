import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;


public interface Ishop {
	
	
	
	void helpinfo();
	void addShop(ArrayList<Shop>arrayList,Scanner sc);
	void stockshop(ArrayList<Shop>arrayList,Scanner sc);
	void sellshop(ArrayList<Shop>arrayList,Scanner sc);
	void infoshop(ArrayList<Shop>arrayList);

}
