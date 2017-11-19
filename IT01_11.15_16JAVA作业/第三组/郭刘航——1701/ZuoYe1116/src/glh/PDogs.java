package glh;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PDogs extends Dogs{
	
	//设置警犬的最快时速，
	int speed;
	
	public void speed(){
		System.out.println("我最高速度是"+speed+"km/h");
	}
	
	//它的work方法
	public void work(){
		System.out.println("我会跟随主人，在主人最需要帮助时提供帮助！！！！");
	}

}
