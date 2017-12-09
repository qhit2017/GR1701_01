package hufeilong;

import java.util.ArrayList;
import java.util.Scanner;


public interface ICommodity {
	void helpInfo();
	void addCommodity(ArrayList<Commodity> arrayList,Scanner sc);
	void findCommodity(ArrayList<Commodity> arrayList,Scanner sc);
	void sellCommodity(ArrayList<Commodity> arrayList,Scanner sc);
	void lookCommodity(ArrayList<Commodity> arrayList);
}
