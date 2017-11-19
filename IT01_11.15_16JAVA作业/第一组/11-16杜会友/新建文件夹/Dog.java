package Aanddog;

public class Dog {
	// 定义一个类：狗，属性包括：
	//品种，毛的颜色， 年龄，重量 
	//方法包括：叫、吃、睡觉
    //要求属性私有，并提供get、set方法 
	private  String breed;
	private  String  color;
	private    int year;
	private  int weight;
	 void print_info(){}
			//构造方法（有参）
		
		 Dog(String breeds, String colors, int years, int weights) {
			 super();
			 this.breed = breeds;
			 this.color = colors;
			this.year = years;
			this.weight = weights;
			
		}
	 
	 
		

		public Dog(String string, int i) {
			
		}




		//方法	
		void eat(){
			System.out.println("品种："+breed+"\n颜色："+color+"\n年龄："+year+"\n重量:"+weight);
			System.out.println("叫"+"\n吃"+"\n睡觉");
		
		
		
		
		 
	 } 
	
}

