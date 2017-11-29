package machao;

public class Mouse {
	public Mouse() {
		super();
	}
	public Mouse(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	private String name;
	private String type;
	private int legs;
	private double weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("小声的吱吱叫！");
	}
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("经常去偷吃东西！");
	}
	@Override
	public String toString() {
		return "Mouse [name=" + name + ", type=" + type + ", legs=" + legs
				+ "条, weight=" + weight + "kg]";
	}

}


