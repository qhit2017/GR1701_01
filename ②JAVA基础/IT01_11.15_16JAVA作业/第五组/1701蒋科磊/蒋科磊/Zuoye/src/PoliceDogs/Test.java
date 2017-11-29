package PoliceDogs;

public class Test {

	public static void main(String[] args) {
		Jingquan jingquan04 =new Jingquan();
		jingquan04.breed="藏獒";
		jingquan04.color="白色";
		jingquan04.age=2;
		jingquan04.eyeColor="蓝色";
		jingquan04.leg=4;
		jingquan04.weight=25;
		jingquan04.speed="30km/h";
		
		System.out.println("它是一只"+jingquan04.breed+",");
		System.out.println("这是一只"+jingquan04.color+"的警犬,");
		System.out.println("它今年"+jingquan04.age+"岁了,");
		System.out.println("它的眼睛是"+jingquan04.eyeColor+"的,");
		System.out.println("它有"+jingquan04.leg+"条腿,");
		System.out.println("它大概有"+jingquan04.weight+"斤,");
		System.out.println("它的最快时速是"+jingquan04.speed+"。");
		
		
		
	}
}
