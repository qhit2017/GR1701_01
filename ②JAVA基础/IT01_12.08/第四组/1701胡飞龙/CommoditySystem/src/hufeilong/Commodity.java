package hufeilong;

public class Commodity {
	private String id;
	private String name;
	private double amount;
	private long number;
	public Commodity() {
		// TODO Auto-generated constructor stub
	}
	public Commodity(String id, String name, double amount, long number) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.number = number;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", amount=" + amount
				+ ", number=" + number + "]";
	}

}
