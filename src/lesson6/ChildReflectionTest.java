package lesson6;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ChildReflectionTest extends ReflectionTEst {
	static final int xC = 10;
	public static int yC = 20;
	
	final int x2C = 100;
	public final int y2C = 200;

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		// TODO Auto-generated method stub
		ChildReflectionTest crt = new ChildReflectionTest();
		test(crt);
	}

	static void test(final Object obj) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		final Class	cl = obj.getClass();
				
		System.err.println("Name: "+cl.getName());
		System.err.println("Simple name: "+cl.getSimpleName());
		System.err.println("Package: "+cl.getPackage().getName());
		System.err.println("Parent: "+cl.getSuperclass());
		System.err.println("Interfaces: "+Arrays.toString(cl.getInterfaces()));
	
		if (obj instanceof AutoCloseable) {
			AutoCloseable ac = (AutoCloseable)obj; 
		}
		System.err.println("Fields: "+Arrays.toString(cl.getDeclaredFields()));

		Field f = cl.getSuperclass().getDeclaredField("y");
		System.err.println("Type: "+f.getType());
		System.err.println("Type: "+(f.getType() == int.class));
		f.setAccessible(true);
		System.err.println("Value: "+f.get(null));
		f.set(null, 30);

		Field f2 = cl.getSuperclass().getDeclaredField("y2");
		System.err.println("Type: "+f2.getType());
		System.err.println("Type: "+(f2.getType() == int.class));
		f2.setAccessible(true);
		System.err.println("Value: "+f2.get(obj));
//		f2.set(obj, 30);
		
		System.err.println("MEthods: "+Arrays.toString(cl.getDeclaredMethods()));
		
		Method m = cl.getMethod("close");
	
		m.invoke(obj);
		
		Method m2 = cl.getDeclaredMethod("call", float.class, int[].class);

		m2.invoke(obj, 1.3f, new int[] {2,3,4});
		//		call(1.5f, /*new int[]{*/2, 3, 4/*}*/);
	}

	static void call(float x, int... y) {
		System.err.println("CALL 0 "+Arrays.toString(y));
	}
	
	static void call(float x) {
		System.err.println("CALL 1");
	}

}
