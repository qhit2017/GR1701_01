package shangpin;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ShangPin> arrayList =new ArrayList<ShangPin>();
		
		ShangPinScore emp=new ShangPinScore();
		
		Scanner sc = new Scanner(System.in);
		
			boolean isQuit=true;
			
			String key;
	emp.helpInfo();
			while (isQuit) {			
				key=sc.next();				
				switch (key) {							
					case "Add":		
						
						emp.addShangPin(arrayList, sc);
								
						break;				
					case "1":
						System.out.println("请添加商品信息（格式为：001，xx，0000，xxxx）");
					    emp.addShangPin(arrayList, sc);
						break;
					case "2":
					
					emp.stockShangPin(arrayList, sc);
						break;
					case "3":					
					
					
					emp.sellShangPin(arrayList, sc);				
						break;
					case "4":
						emp.infoShangPin(arrayList, sc);
						break;
					case "5":
						isQuit=false;
						break;

					default:
						System.out.println("您输入的信息有误！");
						break;
				}
			}
			System.out.println("拜拜~");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
	}
