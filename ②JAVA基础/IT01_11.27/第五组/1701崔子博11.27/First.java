
public class First {
	public static void main(String[] args) {
		
		//1 从键盘接收10个数，并存入数组中，然后循环遍历数组中的元素
		
		int []a= new int [10];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=i+1;
			System.out.println("a["+i+"]"+"="+a[i]);
		}
		
	}

}
