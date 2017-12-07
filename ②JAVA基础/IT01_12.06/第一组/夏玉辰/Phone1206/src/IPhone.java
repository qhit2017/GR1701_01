import java.util.ArrayList;
import java.util.Scanner;


public interface IPhone {

	void info();

	void addPhone(ArrayList<Phone> arrayList, Scanner sc);

	void infoPhone(ArrayList<Phone> arrayList);

	ArrayList<Phone> findsex(ArrayList<Phone> arrayList);

	Phone findname(ArrayList<Phone> arrayList);

	Phone findphoneNumber(ArrayList<Phone> arrayList);

}
