package com.zk.qhit;
/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class Cat extends Animal {
        //通过extends实现继承
        //被继承的类叫父类（基类）
        //继承别的类叫子类（派生类）
	    String interest;
	    
	public Cat(String name, String color, double weight, int legs,
				String variety, String interest) {
			super(name, color, weight, legs, variety);
			this.interest = interest;
		}
	
	    void  sleep(){
		super.sleep();
    	System.out.println("我觉得睡觉是一天中最开心的事情");
    }
	
	void snore(){
		super.color=color;
		System.out.println("我打的呼噜可香了");
	}
	void arrestSb(){
		System.out.println("你惹我，我就抓你！！！"); 
	    
	}	    
}
