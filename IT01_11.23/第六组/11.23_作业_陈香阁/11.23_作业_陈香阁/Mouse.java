
public class Mouse {
	//属性包括：姓名、品种、几条腿、体重
	private String name;
	private String breed;
	private String legs;
	private int weight;

	public Mouse() {
	}

	public Mouse(String name) {
		this.name = name;

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

	public String getLegs() {
		return legs;
	}

	public void setLegs(String legs) {
		this.legs = legs;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	

	@Override
	public String toString() {
		return "Mouse [name=" + name + ",  breed=" +  breed + ",legs="
				+ legs + ",weight=" + weight + "]";
	}
}
