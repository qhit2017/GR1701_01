package liuyancong;

/*作者：刘龑聪
       邮箱：15539919713@163.com
 */
public class Cat extends Animal{
	
	public Cat(String name, String color, float weight) {
		super(name, color, weight);
	}

	
	String eyescolor;
	
	void run(){
		System.out.print("边跑边跳的");
		super.run();
	}
	
	void play(){
		System.out.println("喜欢在沙发上玩毛线球！！");
	}
	
	void catchmouse(){
		System.out.println("会抓老鼠！！");
	}
}