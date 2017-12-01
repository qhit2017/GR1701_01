package Practice_1129;
/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IScor {

	//信息
	void info();
	//求和
	double sum (double[] x);
	//最大值
	double max (double[] x);
	//最小值
	double min (double[] x);
	//平均值
	double average (double[] x);
	//排序
	void sort (double[] x);
	//不及格人数
	int numberNot60 (double[] x);
}
