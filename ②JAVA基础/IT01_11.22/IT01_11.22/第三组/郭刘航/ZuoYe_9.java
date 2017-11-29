package glh;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月22日 下午8:29:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ZuoYe_9 {
    static boolean isDivision(int x,int y){
 	   return (y%x==0)?true:false;
    }
    
    static boolean isContainNum(int y,int x){
    	boolean isCotain = false;
    	int z = y;
    	while(z>0){
    		if (z%10==x){
    			isCotain = true;
    			break;
    		}else{
    			z = z / 10;
    		}
    	}
    	return  isCotain;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入N(N<10000)");
		int N = sc.nextInt();
		System.out.println("N范围内所有7的倍数且包含7的数如下表示：");
		if(N < 10000){
		for (int a = 1;a <= N;a++){
			if(isDivision(a,7)&&isContainNum(a, 7)){
				System.out.println(a);
			}
		}
	}
	if (N >= 10000 || N <= 0){
		System.out.println("范围之外");
	}
}
}
