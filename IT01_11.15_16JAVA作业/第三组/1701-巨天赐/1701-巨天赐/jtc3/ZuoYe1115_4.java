package com.glh.qhit;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ZuoYe1115_4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int q = sc.nextInt();
		int w = sc.nextInt();
		int e = sc.nextInt();
		int r = sc.nextInt();
		
		int a;    int d;
		int b;    int f;
		int c;    int g;
		
		int z;    int n;
		int x;    int m;
		int v;    int l;
		
		int t;    int i;
		int y;    int o;
		int u;    int p;
		
		
		a=q>w?q:w;  b=e>r?e:r;
		     c=a>b?a:b;
		     
		     System.out.println(c);
		     
		z=a<b?a:b;  x=q<w?q:w; v=e<r?e:r;
		n=z>x?z:x;  m=x>v?x:v;
		l=n>m?n:m;
		
		     System.out.println(l);
		     
		     
		d=q<w?q:w;  f=e<r?e:r;
		      g=d<f?d:f;
		       
		t=d>f?d:f; y=q>w?q:w; u=e>r?e:r;
		i=t<y?t:y; o=y<u?y:u;
		p=i<o?i:o;
		
		     System.out.println(p);
		     
		     System.out.println(g);
		}

}


