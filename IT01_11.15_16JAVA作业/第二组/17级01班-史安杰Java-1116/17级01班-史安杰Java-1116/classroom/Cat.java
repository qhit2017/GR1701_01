package animal;
//子类
public class Cat extends Animal {
	public Cat(String color, double weight, int age) {
		super(color, weight, age);
		// TODO Auto-generated constructor stub
	}
	
	String type;
	int a;
	void climbtree(){
		System.out.println("上树");
	}
	void sleep(){
		System.out.println("睡个好觉");
	}
	public Cat(String color, double weight, int age, String type, int a) {
		super(color, weight, age);
		this.type = type;
		this.a = a;
	}
	void color(){
		System.out.println("我是白色");
	}
	
}
