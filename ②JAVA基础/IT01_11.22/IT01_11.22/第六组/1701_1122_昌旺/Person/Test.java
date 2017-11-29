/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月22日 下午8:31:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package changwang;

public class Test {
	public static void main(String[] args) {
		Workder workder = new Workder();
		Sudent sudent = new Sudent();
		sudent.getContent();
		sudent.say("111");
		workder.getContent();
		workder.say("222");
	}

}
