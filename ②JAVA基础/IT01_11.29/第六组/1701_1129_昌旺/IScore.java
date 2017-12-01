/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月29日 上午8:20:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package changwang;

public interface IScore {
	//菜单帮助
	void info();
	//总分
	double sum(double[] a);
	//最大值
	double max(double[] a);
	//最小值
	double min(double[] a);
	//平均值
	double average(double[] a);
	//小于60人数
	double not(double[] a);
	//由小到大排序
	double[] ppp(double[] a);
	
	
	
	

}
