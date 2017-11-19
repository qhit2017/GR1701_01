package animal;

public class Dogs extends Animal{

	private String varieties;
	private String haircolor;
	private int age;
	private double weight;

	String getVarieties() {
		return varieties;
	}

	void setVarieties(String varieties) {
		if (varieties.length() > 7) {
			System.out.println("火星来的狗？");
		} else {
			this.varieties = varieties;
		}
	}

	String getHaircolor() {
		return haircolor;
	}

	void setHaircolor(String haircolor) {
		if (haircolor.length() > 5) {
			System.out.println("这只狗真亮");
		} else {
			this.haircolor = haircolor;
		}
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		if (age < 0 || age > 17) {
			System.out.println("哮天犬？");
		} else {
			this.age = age;
		}
	}

	double getWeight() {
		return weight;
	}

	void setWeight(double weight) {
		if (weight < 0 || weight > 130) {
			System.out.println("这是一只狗？");
		}else{
			this.weight = weight;
		}
	}

	void barking(String barking) {
		System.out.println(barking);
	}

	void eating(String eating) {
		System.out.println(eating);
	}

	void sleeping(String sleeping) {
		System.out.println(sleeping);
	}

	void dog() {
		System.out.print("品种：\t\t" + varieties 
					   + "\n毛色：\t\t" + haircolor+ "色" 
					   + "\n年龄：\t\t" + age + "岁" 
					   + "\n体重:\t\t" + weight + "kg"
					   + "\n眼睛颜色：\t" + eyescolor + "色"
					   + "\n腿的数量：\t" + legs + "条");
	}
}