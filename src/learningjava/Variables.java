package learningjava;

public class Variables {

	String name;// instance variable

	public Variables(String emp) {
		name = emp;
	}

	public void Age() {
		String Dog = "mohti"; // Local Variable
		int age = 5; // Local Variable
		age = age + 7;
		System.out.println("Dog's age is : " + age);
		System.out.println("Dog name is : " + Dog);
		System.out.println("name is " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variables dog = new Variables("fernandes");
		dog.Age();

	}

}
