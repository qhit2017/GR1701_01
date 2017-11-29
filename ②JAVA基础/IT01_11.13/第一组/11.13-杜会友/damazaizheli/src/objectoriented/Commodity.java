package objectoriented;

public class Commodity {
	/* 创建管理员与商品类，并通过调用构造方法进行实例化
	 创建商品类，并给出商品编号、名称、价格、型号、
	 类别五个属性，并提供三个不同的构造方法：
	 不带参数的，带编号、名称、价格三个参数的，
	 带五个参数的构造方法；分别调用三个构造方法实例化对象，
	 并观察成员变量赋值情况；
*/
	
		int number;
		String name;
		float price;
		String type;
		int category;

		void contat() {
			System.out.println("编号：" + number + "名称：" + name + "价格：" + price
					+ "型号：" + type + "类别：" + category);
	}
	      

}
