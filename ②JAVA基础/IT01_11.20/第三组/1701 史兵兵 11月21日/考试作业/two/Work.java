package two;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月20日 下午8:29:54
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Work {
	public static void main(String[] args) {
		//编写Java程序，输出乘法口诀表。（使用while循环实现）
		  int i=1;
		  while (i<=9){
			  int j=1;
			  
				  while(j<=i){
					  System.out.print(i+"*"+j+"="+i*j+"\t");
				  j++;
			  }
				  System.out.println();
				  i++;
		  }
	}
}
