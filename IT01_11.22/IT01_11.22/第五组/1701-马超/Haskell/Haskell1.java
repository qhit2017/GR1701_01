package machao;


public class Haskell1 {
	public static void main(String[] args) {
             //乘法口诀表(while循环)
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= i) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
