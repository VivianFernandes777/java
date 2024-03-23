package learningjava;

public class Statments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if Statement:
		int Num = 10;
		if (Num == 10) {
			System.out.println("Good Morning");
		}

		// if… else Statement:
		int num1 = 50;
		int num2 = 30;
		if (num1 >= num2) {
			System.out.println("Good day ");
		} else {
			System.out.println("Good Night");
		}

		// if… else…if… else Statement:
		int x = 40;

		if (x == 10) {
			System.out.print("Value of X is 10");

		} else if (x == 20) {
			System.out.print("Value of X is 20");

		} else if (x == 30) {
			System.out.print("Value of X is 30");

		} else {
			System.out.print("This is else statement");

		}

		// Nested if statement:
		int num = 70;
		int i = 100;

		if (num == 70) {
			System.out.println("number is 70");

			if (i == 100) {
				System.out.println("number is 100");

			}
		}

		// switch statement:
		char grade = 'z';
		switch (grade) {

		case 'A':
			System.out.println("Excellent!");
			break;

		case 'B':
			System.out.println("Good done");
			break;
		case 'C':
			System.out.println("Well done");
			break;

		case 'D':
			System.out.println("You passed");

		case 'F':
			System.out.println("Better try again");
			break;

		default:
			System.out.println("Invalid grade");

		}
		String Animal = "dog";
		switch (Animal) {

		case "dog":
			System.out.println("this is dog");
		case "cat":
			System.out.println("this is cat");
		case "donkey":
			System.out.println("this is donkey");
		case "lion":
			System.out.println("this is lion");
		}
	}
}
