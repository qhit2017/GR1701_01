package com.saj;

public class Test {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.breed="拉布拉多";
		dog.color="黄色";
		dog.name="豆豆";
		
		Mouse mouse=new Mouse();
		mouse.breed="家鼠";
	    mouse.name="Jerry";	
	    mouse.legs=2;
	    
	    dog.eat();
	    dog.cry();
	    
	    mouse.cry();
	    mouse.eat();
	}

}
