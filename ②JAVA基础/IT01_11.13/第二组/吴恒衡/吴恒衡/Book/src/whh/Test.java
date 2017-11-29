package whh;
/** 
 * @author  作者 E-mail:2421922506@QQ.com
 * @date    创建时间：2017年11月13日 下午7:49:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Book book =new Book();
		book.name = "Java"
				+ "开发与应用核心";
		book.price = 50;
		book.subject= "计算机";
		book.books();
	}

}
