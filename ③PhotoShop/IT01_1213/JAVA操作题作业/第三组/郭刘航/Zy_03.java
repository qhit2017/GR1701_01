package Zuoye1213;
/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Zy_03 {
	static boolean is6End(int a){
		String s = ""+a;
		if (s.charAt(s.length()-1)=='6') {
			return true;
		} else {
			return false;
		}												
	}	                                            						
	public static void main(String[] args) {
		Zy_03 t03 =new Zy_03();	
		int count = 0;
		for (int i = 10000; i < 100000; i++) {
			if (t03.is6End(i) && i%3==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println();
		System.out.println("�ܹ��У�"+count+"����");
			
	}
}
