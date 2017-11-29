package zuoye;

public class Diliuti06 {

public static void main(String[] args) {
		
		int a =1;
		int sum =0;
		while(a<=10){
			sum+=a;
			a++;
			if(sum>20){
				System.out.println(sum);
				break;
			}
		}
}
}