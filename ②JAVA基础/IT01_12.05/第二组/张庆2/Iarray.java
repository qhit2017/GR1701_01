package zhangqing;

import java.util.ArrayList;
import java.util.Scanner;

public interface Iarray {
	void addstemp(ArrayList<Emploee>arrayList,Scanner sc);
	void removestemp(ArrayList<Emploee>arrayList,String name);
	void setstemp(ArrayList<Emploee>arrayList,Emploee name);
	void findstemp(ArrayList<Emploee>arrayList,Scanner sc);
	void allEmploee(ArrayList<Emploee>arrayList);
	Emploee findstemp(ArrayList<Emploee> arrayList, String name);
}
