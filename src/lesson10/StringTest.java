package lesson10;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "1,2,3,4,5,6,7,8,9,10"
		
		String	s;// = "";
		StringBuilder  sb = new StringBuilder();
		for(int index = 1; index <=10; index++) {
//			s += index+","; // new StringBuilder(s).append(index).
			                // append(",").toString();
			sb.append(index).append(",");
		}
//		s = s.substring(0, s.length()-1);
		s = sb.substring(0, sb.length()-1);
		System.err.println(s);

		int index1;
		char[]	temp = new char[10*2+1];
		for( index1 = 0; index1 < 10; index1++) {
			temp[2*index1] = (char)('1'+index1);
			temp[2*index1+1] = ',';
		}
		temp[2*index1-2] = (char)('0'+index1/10);
		temp[2*index1-1] = (char)('0'+index1%10);
		System.err.println(new String(temp));
	
		// s = "abcdefg";
		// s = "AbCdEfG";
		
		s = "abcdefg";
		
		sb = new StringBuilder();
		for(int index = 0, maxIndex = s.length() / 2; index < maxIndex; index++) {
			sb.append(Character.toUpperCase(s.charAt(2*index)));
			sb.append(Character.toLowerCase(s.charAt(2*index+1)));
		}
		if (s.length() % 2 != 0) {
			sb.append(Character.toUpperCase(s.charAt(s.length()-1)));
		}
		System.err.println(sb.toString());
		
		temp = new char[s.length()];
		for(int index = 0, maxIndex = s.length() / 2; index < maxIndex; index++) {
			temp[2*index] = Character.toUpperCase(s.charAt(2*index));
			temp[2*index+1] = Character.toLowerCase(s.charAt(2*index+1));
		}
		if (temp.length % 0x01 != 0) {
			temp[temp.length-1] = Character.toUpperCase(s.charAt(temp.length-1));
		}
		System.err.println(new String(temp));
		
		// s = " ivAnov   iVan ivANnovich"
		// s = " Ivanov   Ivan Ivannovich";
	
		int	x = Integer.valueOf("123");
		
		// s = "12+44+2"
		// ? 
		
		s = "12+44+2";
		int	sum = 0;
		
		for(String item : s.split("\\+")) {
			sum += Integer.valueOf(item);
		}
		System.err.println("sum="+sum);
	
		int add = 0;
		sum = 0;
		
		for (char item : s.toCharArray()) {
			switch (item) {
				case '0' : case '1' : case '2' : case '3' :
				case '4' : case '5' : case '6' : case '7' :
				case '8' : case '9' :
					add = 10 * add + item - '0';
					break;
				case '+' :
					sum += add;
					add = 0;
					break;
			}
		}
		sum += add;
		System.err.println("Sum="+sum);
		
		// s = "12+45-10+2"
	}
}
