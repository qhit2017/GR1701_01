
package com.qhit.Work;

import javax.swing.plaf.synth.SynthSeparatorUI;


public class Quzi10 {

	public static void main(String[] args) {
		int a = 1;
		while(a<=9){
			int b = 1;
			while(b<=a){
				System.out.print(b+"*"+a+"="+b*a+"\t");
				b++;
			}
			a++;
			System.out.println();
		}
	}
}
