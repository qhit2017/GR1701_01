package glh;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月13日 下午6:15:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Good {
	public static void main(String[] args) {
		Goods good = new Goods();
		good.senu = 001;
		good.price = 2;
		good.name = "郁香鸡";
		good.model = "qs标准认证";
		good.category = "面包";
		
		good.good();
	}
}
