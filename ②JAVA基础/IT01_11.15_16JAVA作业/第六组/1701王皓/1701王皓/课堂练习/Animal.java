package animal;
//父类 
public class Animal {
	private String color;
	double weight;
	int age;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	void eat(String food){
		System.out.println("想要吃"+food);
	}
	void sleep(){
		System.out.println("在睡觉");
	}
	
	void color(){
		System.out.println("黄色");
	}
	public Animal(String color, double weight, int age) {
		this.color = color;
		this.weight = weight;
		this.age = age;
	}
	
	
	
	
	

}
