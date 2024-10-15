package lesson6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]	x = new int[] {2,3,4};
		test(x);
		
		System.err.println("X="+Arrays.toString(x));
		
	}
	
	static void test(Object obj) {
		Class	cl = obj.getClass();
		
		if (cl.isArray()) {
			Array.setInt(obj, 0, 100);
			System.err.println("Len="+Array.getLength(obj));
			Array.newInstance(cl.getComponentType(), 100);
		}
	}

}
