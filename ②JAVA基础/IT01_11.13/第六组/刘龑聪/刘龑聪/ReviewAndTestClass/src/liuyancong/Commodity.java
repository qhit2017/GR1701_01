package liuyancong;

public class Commodity {
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
