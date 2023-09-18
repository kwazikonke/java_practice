package JavaDeepDive;

public class AccessModifiers {
	public int public_var = 5;
	private int private_var = 10;
	protected int protected_var= 15;
	int default_var =20;
	
	public void displayVariables() {
		
		System.out.println("public Variable: " + public_var );
		System.out.println("private Variable: " + private_var );
		System.out.println("protected Variable: " + protected_var );
		System.out.println("default Variable: " + default_var );
	}
	

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		
		obj.displayVariables();
		System.out.println("Accessing publicVar:" + obj.public_var);
		System.out.println("Accessing protected:" + obj.protected_var);

	}

}
