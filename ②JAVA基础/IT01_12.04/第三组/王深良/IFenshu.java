import java.util.ArrayList;
import java.util.Scanner;

public interface IFenshu {

	
	void in();

	
	void addFenshu(ArrayList<Kaoshen> arrayList, Scanner sc);

	
	void infoFenshu(ArrayList<Kaoshen> arrayList);



	double setMAXFenshu(ArrayList<Kaoshen> arrayList, String subject);
}
