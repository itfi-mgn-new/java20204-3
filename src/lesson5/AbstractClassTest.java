package lesson5;

public abstract class AbstractClassTest {
	// 'test' -> &AbstractClassTest::test
	public void test() {
		
	}
	
	// 'test2' -> null
	public abstract void test2();
	
	static void staticTest() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Child extends AbstractClassTest {

	// 'test2' -> &Child::test2
	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
}