package lesson2;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	x, y = 0;
		
		y += (x = 10);
		x = y++; y = --x;
		
		if (x == 0) {
			// lkdfjkdjflkj
			if (y > 0) {
				// dsfkjdsfkl
			}
		}
		else {
			//  djfjksdfhkjhj
		}
		
		while (x > 0) {
			int z = 20;
			x = x - 1;
			continue;	// --> 22
		}
		

		do {
			int z = 30;
			// mnvdfgjfndkjg
			if (x % 2 == 0) {
				break;	// ---> 36
			}
			else {
				continue;	// --- > 35
			}
		} while (x < 0);
		// 36:
		//int i;
		for (int i = 0, cc = 12; i < 10; /* ZZZ: */i-=2, cc*= 5) {
			x += i;
			continue; // --> ZZZ
		}
		// int i = 0;
		// while (i < 10) {
		// 	x += i;
		//  i++;
		// }
		
L1:		for (int i = 0; i < 10; /*L1: */i++) {
			for (int j = 0; j < 10; j++) {
				//break L1;
				continue L1;
			}
		}

		switch (x) {
			case 10 :
				// dfkgjklfdgjkldjkljlkf
				break;
			case 20 :
				// g;lhkfglhk
				break;
			default :
				// fgfdjklgjdf
		}
		
		final int t;
		
		if (x > 0) {
			t = 20;
		}
//		else {
//			t = 10;
//		}
		
		t = 20;
		
		return;
	}
}
