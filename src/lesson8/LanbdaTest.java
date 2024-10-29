package lesson8;

import java.util.Arrays;

public class LanbdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class ZZZ implements MyInterface {
			@Override
			public void print() {
				System.err.println("0060959-0y9");
			}
		};
		
		call(new ZZZ());
		call(new MyInterface() {
			@Override
			public void print() {
				System.err.println("dlfdl;fkl;k");
			}
		});

		call(LanbdaTest::abcde);
	
		call(()->System.err.println("!!!!!!!!!!!!!")/*LambdaTest::lambda$1*/);
	
		Class cl = LanbdaTest.class;
		
		System.err.println("MEthods: "+Arrays.toString(cl.getDeclaredMethods()));
	
		call((x1,x2,x3)->System.err.println("sum="+(x1+x2+x3)));
	}
	
	// private static lambda$1() {
	//  System.err.println("!!!!!!!!!!!!!");
	// }
	
	static void call(MyInterface mi) {
		mi.print();
	}

	static void call(NextInterface ni) {
		ni.print(10,20,30);
		Class cl = ni.getClass();
		
		System.err.println("Name="+cl.getName());
	}
	
	
	// static class JJJJJ {
	//    public  print() {
	//		abcde();
	//    }
	static void abcde() {
		System.err.println("ABCDE");
	}
	// }
}

@FunctionalInterface
interface MyInterface {
	void print();
	default void s() {}
}

@FunctionalInterface
interface NextInterface {
	void print(int x, int y, int z);
}