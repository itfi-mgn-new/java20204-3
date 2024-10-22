package lesson7;

import java.util.Arrays;

public class AnonClassTest {
	static int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int z = 10;

		ZZZ item = new ZZZ() {
						{
							System.err.println("dflkdfjkj");
						}
						int d;
						@Override
						public void print() {
							// TODO Auto-generated method stub
							int f = 0;
							System.err.println("Sum="+(a+d+f+z/* val$z*/));						}
					}; 
	
		Class cl = item.getClass();
		System.err.println("Constructors: "+Arrays.toString(cl.getDeclaredConstructors()));
		System.err.println("Fields: "+Arrays.toString(cl.getDeclaredFields()));
		
		Object	obj = new Object() {}, obj2 = new Object() {};
		
		System.err.println("Class: "+obj.getClass());
	}

}

interface ZZZ {
	void print();
}