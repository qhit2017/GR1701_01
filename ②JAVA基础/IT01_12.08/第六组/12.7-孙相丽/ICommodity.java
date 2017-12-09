package com.Commodity;

import java.util.ArrayList;
import java.util.Scanner;

public interface ICommodity {


	void helpinfo();
	void addCommodity(ArrayList<Commodity> arrayList,Scanner sc);
	void stockCommodity(ArrayList<Commodity> arrayList,Scanner sc);
	void sellCommodity(ArrayList<Commodity> arrayList,Scanner sc);
	void infoCommodity(ArrayList<Commodity> arrayList);
}
