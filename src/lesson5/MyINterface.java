package lesson5;

public interface MyINterface {
	/*public static final */int x = 10;
	
	/*public*/static int getZero() {
		return 0;
	}
	
	default void q() {
	}
	
	/*public*/void print();
	/*public*/int getX();
	/*public*/int getY();
}
