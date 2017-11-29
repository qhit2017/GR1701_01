package machao;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月14日 下午7:25:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Integer {
    public static void main(String[] args) {
    	//求整数1~100的累加值，
    	//但要求跳过各位为3的数
    	 
    			int sum =0;
    			for(int k=1;k<=100;k++){
    				if(!(3==k%10)){
    					sum+=k;
    				}
    			}
    			System.out.println(sum);
    		}
    	}
	

