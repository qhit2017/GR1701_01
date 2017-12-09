package com.WH;

import java.util.ArrayList;
import java.util.Scanner;

public interface ICommoditys {
	
	void helpinfo();
	
	void addCommoditys(ArrayList<Commoditys>arrayList,Scanner sc);
	
	void stockcCommoditys(ArrayList<Commoditys>arrayList,Scanner sc);
	
	void sellCommoditys(ArrayList<Commoditys>arrayList,Scanner sc);
	
	void findcommoditys(ArrayList<Commoditys>arrayList);

}
