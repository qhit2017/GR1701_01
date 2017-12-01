import java.util.ArrayList;


public class Test {
	public static void main(String[] args) {
		
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		
		Employee employee = new Employee("0301","风清扬",100,"20120101","研发部");
		arrayList.add(employee);
		arrayList.add(new Employee("0102","令狐冲",100,"20120101","研发部"));
		arrayList.add(new Employee("0103","吴莫愁",100,"20120101","研发部"));
		arrayList.add(new Employee("0104","任我行",100,"20120101","研发部"));
		System.out.println();
		System.out.println(arrayList.size());
		
		Employee e1=arrayList.get(0);
		String s =e1.toString();
		employee.setSalary(3920);
		arrayList.set(0,employee);
		arrayList.remove(e1);
		
		for (int i = 0; i < args.length; i++) {
			Employee e2= arrayList.get(i);
			System.out.println(e2.toString());
		}
	
	}

}
