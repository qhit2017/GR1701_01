package addressbook;

public class Address {
	private String name;
	private String gender;
	private String telnum;
	
	public Address(){
		
	}
	
	
	
	public Address(String name, String gender, String telnum) {
		super();
		this.name = name;
		this.gender = gender;
		this.telnum = telnum;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getGender() {
		return gender;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public String getTelnum() {
		return telnum;
	}





	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}





	@Override
	public String toString() {
		return "Address [name=" + name + ", gender=" + gender + ", telnum="
				+ telnum + "]";
	}
	
	
	
	
	
}
