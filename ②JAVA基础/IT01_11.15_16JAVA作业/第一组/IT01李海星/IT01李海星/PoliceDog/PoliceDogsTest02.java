package com.zk.qhit


public class PoliceDogsTest02 {
	public static void main(String[] args) {
		PoliceDogs02 policdogs02 = new PoliceDogs02();
		policdogs02.setName("团子");
		policdogs02.setBreed("藏獒");
		policdogs02.setColor("黑色");
		policdogs02.setAge(4);
		policdogs02.setWeight(30);
		policdogs02.eyecolor="黑色";
		policdogs02.leg=4;
		policdogs02.speed="30km/h";
		
		System.out.println("警犬的名字："+policdogs02.getName());
		System.out.println("警犬的颜色："+ policdogs02.getColor());
		System.out.println("警犬的品种："+ policdogs02.getBreed() );
		System.out.println("警犬今年"+ policdogs02.getAge() + "岁");
		System.out.println("警犬的体重是："+policdogs02.getWeight());
		System.out.println("警犬的眼睛是："+policdogs02.eyecolor);
		System.out.println("警犬有"+policdogs02.leg+"腿");
		System.out.println("警犬的平均时速是："+policdogs02.speed);
		
		
		
		
		
	}

}
