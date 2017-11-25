package machao;


public class Haskell2 {
	public static void main(String[] args) {
                 //乘法口诀表(for循环)
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();

		}
	}
}
