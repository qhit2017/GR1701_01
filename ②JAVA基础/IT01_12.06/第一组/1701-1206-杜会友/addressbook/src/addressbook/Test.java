package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList< Address> arrayList = new ArrayList<Address>();
		AddressService contactsService = new AddressService();
		contactsService.helpInfo();
		boolean isquit = true;
		String s;
		while (isquit) {
			s = sc.next();
			switch (s) {
			case "1":
				System.out.println("录入格式姓名，性别，电话号码");
				contactsService.addContacts(arrayList, sc);	
				break;
			case "2":
				contactsService.ergContacts(arrayList);
				
				break;
			case "3":
			String name =sc.next();
				contactsService.nameContacts(arrayList,name);
		
				break;
			case "4":;
			String gender =sc.next();
			contactsService.sexContacts(arrayList, gender);
				break;
			case "5":;
			String telnum =sc.next();
			contactsService.telNumContacts(arrayList, telnum);
				break;
			case "6":
				isquit = false;
				break;
			

			default:
				break;
			}
		}System.out.println("拜拜");

	}

}
