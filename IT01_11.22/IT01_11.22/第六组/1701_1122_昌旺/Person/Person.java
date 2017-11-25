/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月22日 下午8:20:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package changwang;

public abstract class Person {
	String Content;
	
	abstract String getContent();
	
	void say(String getContent){
		System.out.println(getContent());
	}

}
