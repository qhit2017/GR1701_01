package glh;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月13日 下午4:06:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Goods {
	//创建商品类，并给出商品编号、名称、价格、型号、类别五个属性和打印自身信息方法，实例化对象，并观察成员变量赋值情况；
	//商品编号
	int senu;
	//商品名称
	String name;
	//商品价格
	int price;
	//商品型号
	String model;
	//商品类别
	String category;
	
	public void good(){
		System.out.println("商品的编号是:"+senu+
				"，名称是:"+name+
				"，价格是:"+price+
				"，型号是:"+model+
				"，类别是:"+category+"。");
	}
	

}
