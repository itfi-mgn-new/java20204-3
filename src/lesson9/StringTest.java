package lesson9;

import java.util.Arrays;

public class StringTest {
	static String sya = "sya";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	s = "vassya";
		
		System.err.println("Length: "+s.length());
		System.err.println("Hash: "+s.hashCode());
		System.err.println("Equals: "+s.equals("vassya"));
		System.err.println("Equals: "+(s == ("vas"+sya)));
		System.err.println("Equals no case: "+s.equalsIgnoreCase("VaSsYa"));
		
		switch (s/*.hashCode()*/) {
			case "vassya"/*.hashCode()*/ :
				// if (s.equals("vassya")) {
				System.err.println("dkjfjsdfjf");
				// }
				break;
			case "petya" :
				System.err.println("454387973459798");
				break;
		}
		
		System.err.println("COmpare: "+s.compareTo("petya"));
		System.err.println("COmpare no case: "+s.compareToIgnoreCase("PeTyA"));
		
		System.err.println("Char: "+s.charAt(0));
	
		System.err.println("INdex: "+s.indexOf("a"));
		System.err.println("Last INdex: "+s.lastIndexOf("a"));
		System.err.println("INdex: "+s.indexOf('a', 3));
	
		System.err.println("StartsWith: "+s.startsWith("vas"));
		System.err.println("EndsWith: "+s.endsWith("ya"));
		System.err.println("Contains: "+s.contains("ss"));
	
		System.err.println("Substr: "+s.substring(2));
		System.err.println("Case: "+s.toUpperCase());
		System.err.println("Replace: "+s.replace("ss",""));
		System.err.println("Trim: "+s.trim());
		
		System.err.println("Split: "+Arrays.toString(s.split("a")));
		
		StringBuilder	sb = new StringBuilder();
		
		String temp = sb.append("Split: ")
				.append(Arrays.toString(s.split("a")))
				.toString();
		System.err.println(temp);
	}
}
