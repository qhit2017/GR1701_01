package machao;


package com.adress;


public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		AdressBookService abs = new AdressBookService();
		abs.helpInfo();
		boolean isExit = true;
		while (isExit) {
			System.out.println("请输入指令并按回车键!");
			int k = sc.nextInt();
			switch (k) {
			
			case 1:
				abs.addContacts(arrayList, sc);
				break;
				
			case 2:
				abs.infoContacts(arrayList);
				break;
				
			case 3:
				System.out.println("请输入姓名");
				String name =sc.next();
				if (abs.findByname(arrayList, name)==null) {
					System.out.println("查无此人！");
				} else {
					System.out.println(abs.findByname(arrayList, name).toString());
				}
				break;
				
			case 4:
				System.out.println("请输入性别");
				String sex =sc.next();
				for (int i = 0; i <abs.findBysex(arrayList, sex).size(); i++) {
					System.out.println(abs.findBysex(arrayList, sex).get(i).toString());
				}
				break;
				
			case 5:
				System.out.println("请输入电话号码");
				String telnum =sc.next();
				if (abs.findBynum(arrayList, telnum)==null) {
					System.out.println("查无此人！");
				} else {
					System.out.println(abs.findBynum(arrayList, telnum).toString());
				}
				break;
				
			case 6:
				abs.helpInfo();
				break;
				
			case 7:
				isExit = false;
				break;
				

			default:
				System.out.println("请输入正确的指令！");
				break;
			}
		}
		System.out.println("感谢使用,再见！");
	}
}
