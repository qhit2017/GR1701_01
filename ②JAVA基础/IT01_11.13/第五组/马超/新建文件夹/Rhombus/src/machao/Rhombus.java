package machao;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月14日 下午7:38:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Rhombus {
    public static void main(String[] args) {
		//打印菱形
for (int a = 1; a <= 10; a++) {
			
			for (int b = 9; b >= a; b--) {
				
				System.out.print(" ");
			}
			for (int b = 1; b <= a; b++) {
				
				System.out.print("*");
			}
			for (int b = 1; b < a; b++) {
				
				System.out.print("*");
			}
			System.out.println();
		}

		for (int a = 1; a <= 9; a++) {
			
			for (int b = 1; b <= a; b++) {
				
				System.out.print(" ");
			}
			for (int b = 9; b >= a; b--) {
				
				System.out.print("*");
			}
			for (int b = 9; b > a; b--) {
				
				System.out.print("*");
			}
			System.out.println();

		}		}   	
    }    	
