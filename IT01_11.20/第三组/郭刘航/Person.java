package person;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月21日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public abstract class Person {
	
	abstract String getContent();
	
	void say(){
		System.out.println(getContent());
	}
}