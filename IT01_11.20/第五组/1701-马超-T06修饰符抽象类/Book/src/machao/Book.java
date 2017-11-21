package machao;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月21日 下午8:31:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Book {
	//创建Java Project工程，并创建包名com.zk.qhit.statictest,
	//在包中创建class 类Book.java。 
	//a、给Book.java类创建四个私有成员变量；其中count为static的 。
	//b、在构造方法中实现count值的递增，同时将count值进行稍微的转变赋值给变量no。
	//c、实现成员变量name, price的封装 。
	//d、为no,count提供只读操作 。   
	//e、getInfo（）方法输出书籍的基本信息 。
	//f、在com.tsinghua包下创建测试类TestBook.java 。
	private String name;
	private float price;
	private String type;
	private int pages;
	
	private static int count=0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public static int NO() {
		return count;
	}
	
	public Book(){
		count++;
	}
	public void getinfo(){
		System.out.println("书名："+name+"\n类型："+type+"\n价格："+price+"元\n页数："+pages+"页");
	}
}

