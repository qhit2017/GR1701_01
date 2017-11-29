package changwang;

public class Diwuti {
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