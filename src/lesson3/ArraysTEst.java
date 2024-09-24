package lesson3;

public class ArraysTEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]	x = null;
		int[]	y = new int[] {2*4,3,4,-4};
		int[][]	z = new int[3][];// {new int[2], null, new int[1]};
		
		x = y;
		y = null;
		x = new int[1];
		
		System.err.println("Len="+y.length);
		x = y.clone();
		x[0] = 100;
		System.err.println("y[0]="+y[0]);
		z[0] = new int[10];
		z[1] = null;
		z[2] = new int[1];
		z[0][1] = 100;
		
		for(int var : x) { // for(int index = 0; index < x.length; index++) {
							// int var = x[index];
			
		}
	}

}
