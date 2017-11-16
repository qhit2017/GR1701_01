package glh;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月13日 下午9:42:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Toys {
	//该商品的名字，型号，类型，材质，品牌.......
	//商品名字
	String name;
    //商品型号
	String model;
	//商品类型
	String type;
	//商品材质
	String texture;
	//商品品牌
	String brand;
	
	public void toy(){
		System.out.println("此商品的名字是："+name
				           +";型号是："+model
				           +";类型是："+type
				           +";材质是："+texture
				           +";品牌是："+brand+"。");
	}

}
