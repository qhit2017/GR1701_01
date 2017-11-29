package machao;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月21日 下午8:45:51 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Haskell {
    public static void main(String[] args) {
		//编写JAVA程序,输出乘法口诀表.(使用while偱环实现)
    	System.out.println("乘法口诀表");
		int q = 1;

		do {
			int x = 1;
			do {
				System.out.print(q + "*" + x + "=" + q * x + "\t");
				x++;
			} while (x <= q);
			q++;
			System.out.println();
		} while (q <= 9);
	}


	}

