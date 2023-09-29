package JavaDeepDive;

public class OuterClass {
private int outerVar=10;

public void outerMethod() {
	System.out.println("This is an outer");
}
public class InnerClass {
	public void innerMethod() {
		System.out.println("this is inner");
		System.out.println("outer var" + outerVar);
	}
}
}
