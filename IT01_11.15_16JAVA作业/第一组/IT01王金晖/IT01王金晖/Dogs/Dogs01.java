

public class Dogs01 {
	
		//1  定义一个类：狗，属性包括： 品种，毛的颜色，
		//年龄，重量  方法包括：叫、吃、睡觉
	    //要求属性私有，并提供get、set方法 
		private String name; //，名字
		private String breed; //品种，
		private String color;//颜色，
		private int age;//年龄，
		private double weight;//体重。
		
		
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
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		void bow_wow(){
			System.out.println("汪~汪~");
		}
		void eat(){
			System.out.println("我喜欢吃骨头。");
		}
		void sleep(){
			System.out.println("睡觉~");
		}
		Dogs01(){
			System.out.println();
		}
		
		//"它叫"+name+",它是一只"
		//+breed+"狗"+",它是"+color+",它"
		//+"岁了，"+"它"+weight+"斤。"
		
		
		
		
		
	

}
