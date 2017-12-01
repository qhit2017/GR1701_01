package Grade;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月29日 上午8:23:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface Iscore {

	void info();
	double Sum(double[] d);
	double Max(double[] d);
	double Min(double[] d);
	double Average (double[] d);
	double []Sort(double[]  d);
	int numberNot60(double[] d);
	
}
