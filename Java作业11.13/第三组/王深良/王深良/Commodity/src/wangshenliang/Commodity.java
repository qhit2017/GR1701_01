package wangshenliang;

/**
 * @author 作者 王深良E-mail:793708547@QQ.com
 * @date 创建时间：2017年11月14日 下午7:04:23
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Commodity {

	int id;
	String name;
	int value;
	int model;
	String sclass;

	void SelfBrands() {

		System.out.println("我的编号是：" + id + "  \n我是：           " + name
				+ "  \n我的价格为：" +value + "  \n我的型号是：" + model + "  \n我的类别是："
				+ sclass);
	}

}
