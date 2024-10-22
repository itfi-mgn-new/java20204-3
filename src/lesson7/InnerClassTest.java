package lesson7;

import java.util.Arrays;

public class InnerClassTest {
	static int a;
	int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class cl = Inner.class;
		
		System.err.println("Name="+cl.getName());
		
		System.err.println("Constructors: "+Arrays.toString(cl.getConstructors()));
		System.err.println("Fields: "+Arrays.toString(cl.getDeclaredFields()));
		
		InnerClassTest owner = new InnerClassTest();
	//	Inner	inner = owner.new Inner();
	}

	private static class Inner {
		int d;
		
		public Inner(/*InnerClassTest owner*/) {
			// this.this$0 = owner;
			//
		}
		// public Inner(InnerClassTest owner) {
		//    this.this$0 = owner;
		// }
		
		public void print() {
			int f = 0;
			
			System.err.println("Sum="+a+/*this$0.*/b+d+f);
		}
	}
}
