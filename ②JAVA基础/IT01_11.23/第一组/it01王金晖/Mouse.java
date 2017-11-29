package jtc;

public class Mouse {

	private String name;
	private String breed;
	private int leg;
	private double weight;

	public Mouse() {
		super();
	}

	public Mouse(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	
	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Mouse [name:" + name + ", breed:" + breed + ", leg:" + leg
				+ ", weight:" + weight + "]";
	}
	public String shout() {
		// TODO Auto-generated method stub
		System.out.println("叽 叽 叽！！！");
		return null;
	}

	public String eat() {
		// TODO Auto-generated method stub
		System.out.println("我从不挑食！！！");
		return null;
	}


}


