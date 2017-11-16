package jti;

public class Shushu {
public static void main(String[] args) {
	for (int i = 2; i < 1000; i++) {

		int tem = 0;

		for (int x = 1; x < i; x++) {

			if (i % x == 0) {

				tem += x;
			}
		}

		if (tem == i) {

			System.out.println(i);

		}
	}
	
	
}
}
