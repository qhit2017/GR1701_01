package whh;

/**
 * @author 作者 E-mail:2421922506@QQ.com
 * @date 创建时间：2017年11月13日 下午6:51:35
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Commodity {
	// 商品编号
	String number;

	// 商品名称
	String name;
	// 商品价格
	float price;
	// 商品型号
	int type;
	// 商品类别
	String category;

	void dity() {
		System.out.println("商品编号:" + number + "\n" + "商品名称:" + name + "\n"
				+ "商品价格:" + price + "\n" + "商品型号:" + type + "\n" + "商品类别:"
				+ category );
	}

}
