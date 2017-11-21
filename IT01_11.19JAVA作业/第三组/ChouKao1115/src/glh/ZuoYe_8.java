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
public class ZuoYe_8 {
	public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (i%3==0) {//能被3整除
                if (i%10==6) {//个位是3
                    System.out.println("个位是3并且能被3整除的3位数="+i);
                }
            }
        }
}

}
