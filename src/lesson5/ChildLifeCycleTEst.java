package lesson5;

import lesson4.LifeCycleTEst;

public class ChildLifeCycleTEst extends LifeCycleTEst implements MyINterface, MyINterface2 {
	static final int	x = 20;	// ConstantValue
	static final double	y = 10 + Math.random();
	
	final int		z;
	final double 	t = 10 + Math.random();	
	
	{
		System.err.println("Child: dhffkljklsjlkjlk");
	}
	
	public ChildLifeCycleTEst() {
		// super();
		// t = 10 + Math.random();
		// System.err.println("Child: dhffkljklsjlkjlk");
		//
		super(200);
		System.err.println("URA!!!!");
		z = 100;
	}
	
	public static void main(String[] args) {
		int x = -10;
		System.err.println("Hello world!");

		ChildLifeCycleTEst	clt = new ChildLifeCycleTEst();
		System.err.println("X="+lesson4.LifeCycleTEst.x);
		
		System.err.println("Z="+((LifeCycleTEst)clt).z);
		
		lesson5.ChildLifeCycleTEst.test();
	
		clt.testInstance();
		((lesson4.LifeCycleTEst)clt).testInstance();
		
		LifeCycleTEst lct = clt;
		lct.testInstance();
		clt.zzz(clt);
//		VMT
//		'testInstance' -> &ChildLifeCycleTEst::testInstance
		//					this			VMT
		// invokestatic		- 				-
		// invokevirtual    +               +
		// invokespecial    +               -
		// invokeinterface  +               +
	}

	static {
		System.err.println("Child BEfore main");
	}

	public static void test() {
		System.err.println("Child Life cycle static");
	}
	
	public void zzz(MyINterface p) {
		
	}
	
	public void testInstance() {
		super.testInstance();// invokespecial
		System.err.println("Child Life cycle instance");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	


}
