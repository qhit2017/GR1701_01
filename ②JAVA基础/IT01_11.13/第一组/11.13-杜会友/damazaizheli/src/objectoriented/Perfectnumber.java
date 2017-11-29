package objectoriented;

public class Perfectnumber {
 /* 一个数如果恰好等于它的因子之和，
    这个数就称为 "完数 "。例如6=1＋2＋3.
	编程找出1000以内的所有完数。
*/
	public static void main(String[] args) {
		for (int in = 2; in < 1000; in++) {
		int tem = 0;
		for (int wan = 1; wan < in; wan++) {
			if (in % wan == 0) {

				tem += wan;

			}

		}if(tem==in){System.out.println(in);}

	}

}

}

