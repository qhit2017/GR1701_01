import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		
		
		ArrayList<Contacts>arrayList=new ArrayList<Contacts>();
		
		Scanner sc = new Scanner(System.in);
		
		ContactService contactService = new ContactService();
		
		boolean iskey= true;
		
		contactService.helpInfo();
		
		String s ;
		while (iskey) {
			s= sc.nextLine();
			switch (s) {
			case "1":
				 contactService.addContacts(arrayList, sc);
				break;
			case "2":
				String name = sc.next();
				contactService.findByname(arrayList, name);
				break;
			case "3":
				String sex = sc.next();
				contactService.findBysex(arrayList, sex);
				break;
			case "4":
				String telnu = sc.next();
				contactService.findBynum(arrayList, telnu);
				break;
			case"":
				iskey = false;
				break;
			default:
				break;
			}
		}
		
		
		
	}

}
