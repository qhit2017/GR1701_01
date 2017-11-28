package HEL;

import java.util.Arrays;


public class HomeWork1127_6 {

	public static void main(String[] args) {
		int[] a = {33,46,68,77,34};

		int b = 0;

		for (int j = 0; j < a.length - 1; j++) {

			for (int i = 0; i < a.length - 1; i++) {

				if (a[i] > a[i + 1]) {

					b = a[i];

					a[i] = a[i + 1];

					a[i + 1] = b;

				}

			}
			System.out.println(Arrays.toString(a));
		}
	}
}
