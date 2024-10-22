package lesson7;

import java.util.Arrays;

public class LocalCLassTest {
	static int a;
	int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int z = 10;

		class Inner {
			int d;
	//		Inner(int zzzzzz) {
				// this.val$z = zzzzz;
		//	}
			
			// int val$z;
			public void print() {
				int f = 0;
				System.err.println("Sum="+(a+d+f+z/* val$z*/));
			}	
		}
		
		Class cl = Inner.class;
		Inner inst = new Inner(/*z*/);
		inst.print();
		
		System.err.println("Constructors: "+Arrays.toString(cl.getDeclaredConstructors()));
		System.err.println("Fields: "+Arrays.toString(cl.getDeclaredFields()));
		
		
	}

}
