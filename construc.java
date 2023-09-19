package JavaDeepDive;

public class construc {
	
	 private String name;
	    private int age;
	    
	    // Constructor
	    public construc(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    
	    public void introduce() {
	        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
	    }
	    public static void main(String[] args) {
	        // Create an instance of the Person class using the constructor
	    	construc person = new construc("Kwazi", 24);
	        person.introduce();
	    }
}
