package lesson1;

import java.lang.Object;
import java.lang.System;

public class HelloWorld extends /*java.lang.*/Object  {
	public int x = 10;
	private static double y = 20.0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*java.lang.*/System.err.println("sdsd");
		int	x1 = 10, x2 = 20, x3 = x1 + x2;
		
		System.err.println("x1+x2="+(x1+x2));
		System.err.println("x1-x2="+(x1-x2));
		System.err.println("x1*x2="+(x1*x2));
		System.err.println("x1/x2="+(x1/x2));
		System.err.println("x1%x2="+(x1%x2));
		
		System.err.println("x1|x2="+(x1|x2));
		System.err.println("x1&x2="+(x1&x2));
		System.err.println("x1^x2="+(x1^x2));
		System.err.println("~x1="+(~x1));

		System.err.println("x1<<2="+(x1<<2));
		System.err.println("x1>>2="+((-x1)>>2));
		System.err.println("x1>>>2="+((-x1)>>>2));

		x3 = x1 + (x2 = x1);
		x3 += x1;	// x3 = x3 + x1;
	
		boolean	b1 = true, b2 = false, b3 = b1 && b2;
		
		System.err.println("b1||b2="+(b1||b2));
		System.err.println("b1&&b2="+(b1&&b2));
		System.err.println("!b1="+(!b1));

		System.err.println("b1|b2="+(b1|b2));
		System.err.println("b1&b2="+(b1&b2));

		x1 = x2 > 0 ? x2 : x3;
	
		if (x1 == 0) {
			
		}
		
		//	>
		//	>=
		//	<
		//	<=
		//	==
		//	!=
		
		byte	z1 = 10, z2 = 20, z3 = (byte)(z1 + z2);
	}

	public void print() {
		Object x = null;
	}
	
}
