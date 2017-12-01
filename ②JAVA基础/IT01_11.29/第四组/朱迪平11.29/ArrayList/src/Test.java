import java.util.ArrayList;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月29日 上午10:16:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Test {public static void main(String[] args) {
	ArrayList<Employee> arrayList=new ArrayList<Employee>();
	Employee e=new Employee("0001" ,"迪丽热巴",100000, "19980528", "演艺界");
	arrayList.add(e);
	arrayList.add(new Employee("0001" ,"杨洋",50000, "19980528", "演艺界"));
	arrayList.add(new Employee("0002" ,"邓伦",55000, "19980528", "演艺界"));
	arrayList.add(new Employee("0003" ,"李易峰",17000, "19980528", "演艺界"));
	arrayList.add(new Employee("0004" ,"赵丽颖",19000, "19980528", "演艺界"));
	System.out.println(arrayList.size());
	arrayList.get(0);
	System.out.println(arrayList.get(0));
	arrayList.set(0, e);
	e.setDate("19980707");
	arrayList.remove(0);
	for (int i = 0; i < arrayList.size(); i++) {
		Employee e1=arrayList.get(i);
		System.out.println(e1.toString());
	}
	
	
	
	
	
	
	
	
	
	
	
}

}
