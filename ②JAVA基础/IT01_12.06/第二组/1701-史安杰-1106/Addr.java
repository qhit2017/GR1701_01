import java.util.ArrayList;
import java.util.Scanner;

public interface Addr {

	void addAddr(ArrayList<Address> arrayList, Scanner sc);

	void infoAddr(ArrayList<Address> arrayList);

	ArrayList<Address> findBysex(ArrayList<Address> arrayLists, String sex);

	Address findByname(ArrayList<Address> arrayList, String name);

	Address findBycall(ArrayList<Address> arrayList, String call);

	void help();

}
