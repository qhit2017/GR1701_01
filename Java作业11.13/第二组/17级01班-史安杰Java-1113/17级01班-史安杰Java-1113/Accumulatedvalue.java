package commodity;

public class Accumulatedvalue {
	public static void main(String[] args) {
		int i = 0;
		for(int s = 1;s<=100;s++){
			if(s%10==3){
				continue;
			}
			i+=s;
			
			
		}System.out.println(i);
	}

}
