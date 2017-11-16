package gaojie;
/** 
 * 作者：高洁
 * E-mail:740997177@qq.com
               电话:17630520503
 
 * 创建时间：2017年11月13日 下午7:00:00
 */
public class Accumulation1113 {
	public static void main(String[] args) {
		int g = 0;
		for(int i = 1;i<=100;i++){
			if(i%10==3){
				continue;
			}
			g+=i;
			
			
		}System.out.println(g);
	}

}
