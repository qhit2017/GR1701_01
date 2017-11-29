package liuyancong;
/*作者：刘龑聪
       邮箱：15539919713@163.com
 */
public class Animal {
	String name;
	private String color;
	float weight;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

	
	public Animal(String name, String color, float weight) {
		System.out.println("有参的构造方法！！！");
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	void eat(String food){
		System.out.println("喜欢吃"+food+"!");
	}
	void run(){
		System.out.println("奔跑！！");
	}
	void sleep(){
		System.out.println("喜欢睡懒觉！");
	}
	
	void shuxing(){
		System.out.println("名字：\t"+name+"\n颜色：\t"+color+"\n体重：\t"+weight+"kg");
	}
}
