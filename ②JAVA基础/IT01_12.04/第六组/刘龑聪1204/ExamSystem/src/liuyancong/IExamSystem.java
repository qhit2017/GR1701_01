package liuyancong;

import java.util.ArrayList;
import java.util.Scanner;

/*Author£ºÁõýŒ´Ï
  E-mail£º15539919713@163.com
 */
public interface IExamSystem {

	void help1();
	void help2();
	void addStudent(ArrayList<Student> arrayList,Scanner sc);
	void infoStudent(ArrayList<Student> arrayList);
	void MaxScore(ArrayList<Student> arrayList,Scanner sc);
	
}
