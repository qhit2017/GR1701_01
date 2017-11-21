
package com.qhit.Work;

public class Quzi3 {

	public static void main(String[] args) {
		boolean x;
		for(int a = 1;a <= 1000;a++){
			x = true;
			if(a%2==0){
				x = false;
				continue;
			}
			if (x){
				System.out.println("1000ÄÚµÄÆæÊý:"+a);
				}
		}
	}
}
