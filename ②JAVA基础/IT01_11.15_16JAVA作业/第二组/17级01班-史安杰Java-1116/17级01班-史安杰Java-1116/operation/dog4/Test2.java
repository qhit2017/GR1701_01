
public class Test2 {
	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		dog.breed = "拉布拉多";
		dog.color = "黄";
		dog.weight = 71;
		dog.age = 4;
		dog.eyescolor = "黑色";
		dog.legs = 4;
		dog.speed = 20;
		
		dog.message();
		System.out.println();
		dog.eat();
		System.out.println();
		dog.work();
	}

}
