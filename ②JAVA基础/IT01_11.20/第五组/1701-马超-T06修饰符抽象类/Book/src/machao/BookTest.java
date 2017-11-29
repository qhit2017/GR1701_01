package machao;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月21日 下午8:36:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class BookTest {
public static void main(String[] args) {
		
		Book OliverTwist=new Book();
		OliverTwist.setName("雾都孤儿");
		OliverTwist.setType("长篇写实小说");
		OliverTwist.setPrice(59);
		OliverTwist.setPages(231);
		
		OliverTwist.getinfo();
		
		int NO=Book.NO();
		System.out.println(NO);
	}
}

