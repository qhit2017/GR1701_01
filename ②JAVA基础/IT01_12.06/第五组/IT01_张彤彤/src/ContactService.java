import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ContactService implements Icontacts {

	
	public void helpInfo(){
		 System.out.println("---通讯录系统---");
		 System.out.println("[1]录入通讯录请按1");
		 System.out.println("[2]显示所有通讯录请按2");
		 System.out.println("[3]姓名搜索请按3");
		 System.out.println("[4]性别搜索请按4");
		 System.out.println("[5]电话搜索请按5");
		 System.out.println("[6]退出请按6");

	}

	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
	
		String s = sc.next();
		String []a= s.split(",");
		if (a.length!=3) {
			System.out.println("你输入的数据不完整");
		} else {
			Contacts contacts =new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());

		}
		
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
	
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
	}

	@Override
	public ArrayList<Contacts> findBysex(ArrayList<Contacts> arrayList,
			String sex) {
	for (Contacts contacts : arrayList) {
		String sex2=contacts.getSex();
		if (contacts.getName().equals(null)) {
			System.out.println(contacts.toString());
			arrayList.add(contacts);
			
		}else {
			System.out.println("没有此种性别的联系人");
		}
	}
		return null;
	}

	@Override
	public Contacts findByname(ArrayList<Contacts> arrayList, String name) {
		for (Contacts contacts : arrayList) {
			if (contacts.getName().equals(name)) {
				System.out.println(contacts.toString());
			}
		}
		
		return null;
	}

	@Override
	public Contacts findBynum(ArrayList<Contacts> arrayList, String telnum) {
		// TODO Auto-generated method stub
		for (Contacts contacts : arrayList) {
			if (contacts.getSex().equals(telnum)) {
				System.out.println(contacts.toString());
			}
		}
		return null;
	}

}
