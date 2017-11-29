
public  class  Animal {
	String color;
	int weight;
	int age;
	
	public Animal(String color,int weight ) {
		this.color = color;
		this.weight = weight;
		
	}
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
	   
	

}
