package shangpin;

import java.util.ArrayList;
import java.util.Scanner;

public class ShangPin {
	private String id;
	private String name;
	private long jiage;
	private long shuliang;
	public ShangPin() {
		super();
	}
	public ShangPin(String id, String name, long jiage, long shuliang) {
		//super();
		this.id = id;
		this.name = name;
		this.jiage =  jiage;
		this.shuliang = shuliang;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getJiage() {
		return jiage;
	}
	public void setJiage(long jiage) {
		this.jiage = jiage;
	}
	public long getShuliang() {
		return shuliang;
	}
	public void setShuliang(long shuliang) {
		this.shuliang = shuliang;
	}
	@Override
	public String toString() {
		return "ShangPin [id=" + id + ", name=" + name + ", jiage=" + jiage
				+ ", shuliang=" + shuliang + "]";
	}
	public void help() {
		// TODO Auto-generated method stub
		
	}
	public void addShangPin(ArrayList<ShangPin> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	public void infoShangPin(ArrayList<ShangPin> arrayList) {
		// TODO Auto-generated method stub
		
	}
	public void setEmployee(ArrayList<ShangPin> arrayList, Object name2) {
		// TODO Auto-generated method stub
		
	}
	public void addShangPin(ArrayList<ShangPin> arrayList, Object name2) {
		// TODO Auto-generated method stub
		
	}
	

}
