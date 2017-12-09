import java.util.ArrayList;
import java.util.Scanner;

public interface ICommodity {

	void info();

	void addCommodity(ArrayList<Commodity> arrayList, Scanner sc);

	void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc);

	void marketCommodity(ArrayList<Commodity> arrayList, Scanner sc);

	void infoCommodity(ArrayList<Commodity> arrayList);
}
