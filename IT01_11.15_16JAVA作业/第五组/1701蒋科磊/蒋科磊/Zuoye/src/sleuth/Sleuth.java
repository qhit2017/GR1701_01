package sleuth;

public class Sleuth {

	String variety;
	String colour;
	float weight;
	int age;
	String EYES;
	int number;
	int speed;
	public Sleuth(String variety, String colour, float weight, int age,
			String eYES, int number, int speed) {
		super();
		this.variety = variety;
		this.colour = colour;
		this.weight = weight;
		this.age = age;
		EYES = eYES;
		this.number = number;
		this.speed = speed;
	}
	void info(){
		System.out.println("品种是："+variety+"\n"
				+ "毛的颜色是："+colour+"\n"
				+"重量是："+weight+"kg"+"\n"
				+"年龄是："+age+"岁"+"\n"
				+ "眼睛颜色是："+EYES+"\n"
				+ "腿的数量是:"+number+"\n"
				+ "最快时速是:"+ speed + "km" + "\n");
	}

}
