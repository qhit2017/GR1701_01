
public class Mouse implements IAnimal {

	
	private String name;
	private String breed;
	private int legs;
	private double weight;
	

	
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

	public Mouse() {
	
	}
	
	Mouse(String name,String breed){
		this.name=name;
		this.breed=breed;
		
	}
	
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("³ÔÃ×");
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("Ö¨Ö¨½Ð");
		
	}
	

}
