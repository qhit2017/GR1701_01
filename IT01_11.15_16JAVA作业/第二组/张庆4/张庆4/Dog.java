package zhangqing;

public class Dog {

	//属性
	String  breed;
	String  color;
	int     year;
	long    weight;
	
	//构造方法（有参）
	
	 Dog(String breeds, String colors, int years, int weights) {
		 super();
		 this.breed = breeds;
		 this.color = colors;
		this.year = years;
		this.weight = weights;
		
	}
	
 
	

	public Dog(String string, int i) {
		// TODO Auto-generated constructor stub
	}




	//方法	
	void eat(){
		System.out.println("品种："+breed+"\n颜色："+color+"\n年龄："+year+"\n重量:"+weight);
		System.out.println("叫"+"\n吃"+"\n睡觉");
	}
	
	
}
