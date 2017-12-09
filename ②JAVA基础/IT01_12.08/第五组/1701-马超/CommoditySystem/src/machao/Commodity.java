package machao;

public class Commodity {

	private String id;
	private String name;
	private double price;
	private long Number;
	

	public Commodity(String id, String name, double price, long num) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.Number = Number;
		
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getNumber() {
		return Number;
	}
	public void setNumber(long num) {
		this.Number = Number;
	}
	
	
	@Override
	public String toString() {
		return "Commodity [编号=" + id + ", 商品名称=" + name + ", 价格=" + price
				+ ",初始数量 =" + Number + "]";
	}
	
	
}
