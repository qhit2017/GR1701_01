package one1;

public class Task {
	/**1、创建商品类， 
	创建商品类，并给出商品编号、名称、价格、型号、
	类别五个属性和打印自身信息方法，实例化对象，并
	观察成员变量赋值情况； */
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


