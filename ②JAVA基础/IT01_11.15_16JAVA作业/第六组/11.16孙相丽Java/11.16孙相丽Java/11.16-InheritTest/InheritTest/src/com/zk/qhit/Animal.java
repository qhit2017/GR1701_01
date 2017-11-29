package com.zk.qhit;
/**
 *time:11.16
 *week:Thursday
 *weather:sun
 *site:machine room
 *author:sun
 */
public class Animal {
	//属性
	String name;
    String color;
	double weight;
	int legs;
	private String variety;  
	
	/**Animal(){
		System.out.println("我是无参的构造方法，我正在被调用....");
	}
	*/
	

	public Animal(String name, String color, double weight, int legs,
			String variety) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.legs = legs;
		this.variety = variety;
	}

	private String getVariety() {
		return variety;
	}



	private void setVariety(String variety) {
		this.variety = variety;
	}

	//方法
	//括号内为参数（形式参数），也是变量（局部变量）
	void eat(String food){
		System.out.println("我最喜欢吃这种食物"+food);
	}
	
   /** private void  sleep(){
    	System.out.println("睡眠是一种众生平等");
    }
    */
     void  sleep(){
    	System.out.println("睡眠是一种众生平等");
    }
    void run(){
    	System.out.println("我跑的可快了");
    }
    
}
