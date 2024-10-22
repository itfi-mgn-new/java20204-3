package lesson7;

import java.util.Arrays;

public class EnumTEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Days d = Days.saturday;
		
		System.err.println("NAme="+d.name());
		System.err.println("Ordinal="+d.ordinal());
		
		if (d == Days.saturday) {
			// fkjkgsdfjkldfjlk
		}
		
		switch (d/*.ordinal()*/) {
			case friday/*.ordinal()*/:
				break;
			case monday/*.ordinal()*/:
				break;
			case saturday/*.ordinal()*/:
				break;
			case sunday:
				break;
			case thirsday:
				break;
			case tuesday:
				break;
			case wednesday:
				break;
			default:
				break;
		}
		
		Class cl = EnumTEst.class;
		
		System.err.println("Methods: "+Arrays.toString(cl.getDeclaredMethods()));
	}

}

/*final*/ enum Days /*extends java.lang.Enum*/ {
/*public static final */	sunday(true) /*= new Days("sunday",0)*/,
/*public static final */	monday(false) /*= new Days("monday",1)*/,
/*public static final */	tuesday(false),
/*public static final */	wednesday(false),
/*public static final */	friday(false),
/*public static final */	thirsday(false),
/*public static final */	saturday(true); /*= new Days("saturday",6)*/

	private final boolean holiday;
	
	private Days(boolean holiday) {
		this.holiday = holiday;
	}
	
	public boolean isHoliday() {
		return holiday;
	}
	
	public int getSomething() {
		return ordinal()*ordinal();
	}

}
