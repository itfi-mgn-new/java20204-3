package lesson3;

import java.util.Objects;

public class ObjectTEst {

	int x = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object	x = new Object();
		Object	y = null;
		y = x;
		if (x == y) {
			System.err.println("Equals...");
		}
		else {
			System.err.println("Not equals...");
		}
		System.err.println(x.toString());
		//x = null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectTEst other = (ObjectTEst) obj;
		return x == other.x;
	}

	
}
