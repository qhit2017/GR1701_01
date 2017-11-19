package com.zk.qhit;
/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class Dog extends Animal {
	/**1  定义一个类：狗，
	 * 属性包括： 品种，毛的颜色， 年龄，重量 
	 *  方法包括：叫、吃、睡觉
	 */
	//静态属性  
		private  String variety;
		private  String color;
		private  int age;
		private  float weight;   
		
	    //动态方法
		void shout(){
			System.out.println("汪汪");
		}
		void eat(){
	        System.out.println("用舌头舔着吃");		
		}
	    void sleep(){System.out.println("晚上睡得极其香");
			
		}
	    //get set方法
	    public  String getvariety(){
	    	return variety;
	    }
	    public void  setvariety(String variety ){
	    	this.variety = variety;
	    }
	    //
	    public  String getcolor(){
	    	return color;
	    }
	    public void  setcolor(String color ){
	    	this.color = color;
	    }
	    //
	    public  int getage(){
	    	return age;
	    }
	    public void  setage(int age ){
	    	this.age = age;
	    }
	    //
	    public  float getweight(){
	    	return weight;
	    }
	    public void  setweight(float weight ){
	    	this.weight = weight;
	    }

}
