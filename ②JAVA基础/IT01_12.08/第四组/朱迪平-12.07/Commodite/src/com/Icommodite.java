package com;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 作者 E-mail:李永立271406@163.com
 * @date 创建时间：2017年12月7日 下午2:29:29
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public interface Icommodite {
	void helpInfo();

	void addCommodite(ArrayList<Commodite> arrayList, Scanner sc);

	void stockCommodite(ArrayList<Commodite> arrayList, Scanner sc);

	void sellCommodite(ArrayList<Commodite> arrayList, Scanner sc);

	void InfoCommodite(ArrayList<Commodite> arrayList);

}
