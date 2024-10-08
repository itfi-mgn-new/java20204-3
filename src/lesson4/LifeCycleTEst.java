package lesson4;

public class LifeCycleTEst {
	protected static final int	x = 10;	// ConstantValue
	static final double	y = Math.random();

	public final int		z;
	final double 	t = Math.random();
	
	{
		System.err.println("laskjdfkljdj");
	}
	
	public LifeCycleTEst(/*LifeCycleTEst this */) {
		// System.err.println("laskjdfkljdj");
		this(20);
		//this.z = 20;
	}
	
	public LifeCycleTEst(/*LifeCycleTEst this, */int a) {
		super();
		// System.err.println("laskjdfkljdj");
		this.z = a;
	}
	
	// public void <init>() {
	//	 z = 20;
	//	 t = Math.random();
	//   System.err.println("laskjdfkljdj");
	// }
	
	// public static void <clinit>() {
	// 	y = Math.random();
	// 	System.err.println("BEfore main");
	// }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world");
		
		LifeCycleTEst t = new LifeCycleTEst(/*t,*/100);
		LifeCycleTEst t2 = new LifeCycleTEst(/*t2,*/200);
		
		System.err.println(t.z);
		System.err.println(t2.z);
	
		t = null;
	}

	static {
		System.err.println("BEfore main");
		test();
	}
	
	public static void test() {
		System.err.println("Life cycle static");
	}
	
	public void testInstance() {
		System.err.println("Life cycle instance");
	}
	
}
