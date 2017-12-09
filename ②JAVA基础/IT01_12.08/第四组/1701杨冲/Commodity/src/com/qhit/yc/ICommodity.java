package com.qhit.yc;

import java.util.ArrayList;
import java.util.Scanner;

public interface ICommodity {
	
	void helpInfo();
    void addCommodity(ArrayList<Commodity>arrList,Scanner sc);
    void stockCommodity(ArrayList<Commodity>arrList,Scanner sc);
    void sellCommodity(ArrayList<Commodity>arrList,Scanner sc);
    void InfoCommodity(ArrayList<Commodity>arrList);
}
