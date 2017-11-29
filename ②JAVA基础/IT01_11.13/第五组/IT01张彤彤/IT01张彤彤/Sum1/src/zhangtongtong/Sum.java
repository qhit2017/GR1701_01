package zhangtongtong;

public class Sum {

	public static void main(String[] args) {
		int i ;
		int l ;
		for(i = 2;i<=1000;i++){
			int Sum = 0;
			for(l = 1;l<i;l++){
				if(i%l==0){
					Sum +=l;
				}
			}
			if(i==Sum){
				System.out.println(i);
			}
		}
	}
}
