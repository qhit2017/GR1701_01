import java.util.ArrayList;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月29日 上午10:15:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		
		ArrayList<Employees> arrayList =new ArrayList<Employees>();
		Employees e =new Employees("0301", "夏未央", 4500, "2012.12.24", "公关部");
		arrayList.add(e);
		arrayList.add(new Employees("0302", "夏天", 4700, "2012.12.24", "技术部"));
		arrayList.add(new Employees("0303", "杨耿耿", 6500, "2011.11.11", "保安部"));
		arrayList.add(new Employees("0304", "张团子", 8500, "2006.06.06", "科研部"));
		arrayList.add(new Employees("0305", "季羊羊", 5500, "2017.07.07", "秘书部"));
		arrayList.add(new Employees("0306", "陈默默", 3500, "2015.12.25", "公关部"));
		
		System.out.println();
		System.out.println(arrayList.size());
		System.out.println();
		arrayList.get(1);
		e.setSalary(6000);
		arrayList.set(0, e);
		System.out.println();
		arrayList.remove(e);
		Employees e1 =arrayList.get(0);
		String s=e1.toString();
		System.out.println(s);
		
		System.out.println(arrayList);
		
		
		
		
		
	}

	private static Employees  toSting() {
		// TODO Auto-generated method stub
		return null;
	}

}
