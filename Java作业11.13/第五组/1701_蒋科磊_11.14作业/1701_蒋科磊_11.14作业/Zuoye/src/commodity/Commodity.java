package commodity;

public class Commodity {

	//创建商品类，并给出商品编号、名称、价格、型号、类
	//别五个属性和打印自身信息方法，实例化
	//对象，并观察成员变量赋值情况；
	int id;
	String name;
	String type;
	int price;
	String sort;
	
	public void commodity(){
		System.out.println("商品编号:"+id+"\n"
							+"商品名称:"+name+"\n"
							+"商品价格:"+price+"元\n"
							+"商品型号:"+type+"\n"
							+"商品类别:"+sort+"\n");
	}
}
