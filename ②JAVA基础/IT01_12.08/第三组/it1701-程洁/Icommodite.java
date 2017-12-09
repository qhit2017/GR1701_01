package com;

import java.util.ArrayList;
import java.util.Scanner;

public interface Icommodite {
	void helpInfo();

	void addCommodite(ArrayList<Commodite> arrayList, Scanner sc);

	void stockCommodite(ArrayList<Commodite> arrayList, Scanner sc);

	void sellCommodite(ArrayList<Commodite> arrayList, Scanner sc);

	void InfoCommodite(ArrayList<Commodite> arrayList);

}
