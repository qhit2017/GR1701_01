package four;

public class ZUOYE {
	public static void main(String[] args) {
		//编写JAVA程序，1至10之间的整数相加，得到累加值大于20的当前数字，并将该数字输出
	/**	int c=0;
		for(int a=1;a<=10;a++){
			c +=a;
		}if(c>20){
			System.out.println(a);
			}*/
	
		int count = 0;
		for(int i=1;i<=10;i++){
		    count  = count +i;
		    if(count>20){
		       System.out.println(i);
		       break;
		}
	}
	}

}