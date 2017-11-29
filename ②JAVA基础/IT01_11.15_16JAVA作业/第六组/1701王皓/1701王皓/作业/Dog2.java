
public class Dog2 {
	String breed;
    String color;
int weight;
int age;
String eyescolor;
int legs;
int speed;

void message(){
	System.out.println("警犬，品种是"+breed+ "，颜色是"+color+
	 "，体重是"+weight+ "磅，我已经"+age+"岁了，眼睛的颜色                是"+eyescolor+ "，我有"+legs+"条腿，最快的速度是"+speed+"km/h");
}

public void eat(){
	System.out.println("吃骨头");
}
public void work(){
	System.out.println("我会跟着主人，在主人最需要我的时提供帮助。");
}

}
