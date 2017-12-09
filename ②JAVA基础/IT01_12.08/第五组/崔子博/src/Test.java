import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		
		ArrayList<Shop>arrayList= new ArrayList<Shop>();
		
		Scanner sc = new Scanner(System.in);
		
		ShopServoce shopServoce= new ShopServoce();
		
		boolean  key= true;
		
		shopServoce.helpinfo();
		
		String s;
		while (key) {
			s=sc.nextLine();
			switch (s) {
			case "1":
				System.out.println("录入商品信息包含商品编号、名称、价格、初始数量");
				shopServoce.addShop(arrayList, sc);;
				
				break;
			case "2":
				System.out.println("添加商品 例如：编号，进货数量");
				shopServoce.stockshop(arrayList, sc);
				break;
			case "3":
				System.out.println("添加商品 例如：编号，销货数量");
				shopServoce.sellshop(arrayList, sc);
				break;
			case "4":
				
				shopServoce.infoshop(arrayList);
				break;
			case "5":
				key=false;
			
				break;

			default:
				System.out.println("错误");
				break;
			}
		}
		System.out.println("退出系统");
		
	}

}
