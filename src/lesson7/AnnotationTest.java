package lesson7;


@MyAnnotation(value="assa")
public class AnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAnnotation ma = AnnotationTest.class.getAnnotation(MyAnnotation.class);
		
		System.err.println("Value: "+ma.value());
	}

}
