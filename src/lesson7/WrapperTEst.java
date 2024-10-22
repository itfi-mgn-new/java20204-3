package lesson7;

public class WrapperTEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte   	- Byte     ->Number->Object
		// short  	- Short
		// int    	- Integer
		// long   	- Long
		// float  	- Float
		// double 	- Double
		// char   	- Character ->Object
		// boolean	- Boolean   ->Object
		
		int	x1 = 10, x2 = 20, x3 = x1 + x2;
		
		Integer  ix1 = 10,	// Integer.valueOf(10)
				 ix2 = 20,	// Integer.valueOf(20)
				 ix3 = ix1 + ix2; // Integer.valueOf(ix1.intValue()+ix2.intValue());
		x1 = ix1; // ix1.intValue()
	}

}
