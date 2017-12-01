package Practice_1129;

import java.util.ArrayList;

/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		Employee a = new Employee("0100","独孤剑", 100, "1998/06/14", "剑客");
	    arrayList.add(a);
	    arrayList.addAll(arrayList);
	    arrayList.add(new Employee("0101", "荆轲", 0, "0", "刺客"));
	    arrayList.add(null);
	    System.out.println();
	    System.out.println(arrayList.size());
	    arrayList.get(0);
	}

}
