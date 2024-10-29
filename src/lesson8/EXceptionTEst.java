package lesson8;

public class EXceptionTEst {
	static void error(int errno) throws RuntimeException, Exception, Throwable {
		switch (errno) {
			case 0 :
				throw new RuntimeException("RTE!");
			case 1 :
				throw new Exception("EXCEPTION!");
			case 2 :
				throw new Throwable("THRWABLE!");
			default :
		}
	}
	
	static void nestedError(int errno) throws Throwable {
		try {
			error(errno);
		} catch (Exception e) {
			System.err.println("0000000000000000000");
		} finally {
			System.err.println("++++++++++++");
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-gesnerated method stub
		Throwable	t = new Throwable("This is a BUG!!!!!!");
		
		for (int index = 0; index <= 3; index++) {
			try {
				nestedError(index);
				System.err.println("SUCCESS");
			} catch (RuntimeException exc) {
				System.err.println("RUNTIME: "+exc.getMessage());
			} catch (Exception exc) {
				System.err.println("EXC: "+exc.getMessage());
			} catch (Throwable exc) {
				exc.printStackTrace();
				System.err.println("T: "+exc.getMessage());
			} finally {
				System.err.println("FINALLY");
			}
		}
	}

}
