package learningjava;

public class Operators {
//Arithmetic Operators
	public void ArithmeticOperator() {
		int num1 = 10;
		int num2 = 5;

		System.out.println("num1 + num2: " + (num1 + num2));
		System.out.println("num1 - num2: " + (num1 - num2));
		System.out.println("num1 * num2: " + (num1 * num2));
		System.out.println("num1 / num2: " + (num1 / num2));
		System.out.println("num1 % num2: " + (num1 % num2));

	}
//Assignment Operators
	public void AssignmentOperator() {
		int num1 = 10;
		int num2 = 20;

		num2 = num1;
		System.out.println("= Output: " + num2);

		num2 += num1;
		System.out.println("+= Output: " + num2);

		num2 -= num1;
		System.out.println("-= Output: " + num2);

		num2 *= num1;
		System.out.println("*= Output: " + num2);

		num2 /= num1;
		System.out.println("/= Output: " + num2);

		num2 %= num1;
		System.out.println("%= Output: " + num2);
	}
//Auto-increment and Auto-decrements Operators
	public void AutoOperator() {
		int num1 = 100;
		int num2 = 200;
		num1++;
		num2--;
		System.out.println("num1++ is: " + num1);
		System.out.println("num2-- is: " + num2);
	}
//Logical Operators
	public void LogicalOperator() {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1 && b2: " + (b1 && b2));
		System.out.println("b1 || b2: " + (b1 || b2));
		System.out.println("!(b1 && b2): " + !(b1 && b2));
	}
//Comparison(Relational) operators
	public void RelationalOperator() {
		int num1 = 10;
		int num2 = 50;
		if (num1 == num2) {
			System.out.println("num1 and num2 are equal");
		} else {
			System.out.println("num1 and num2 are not equal");
		}

		if (num1 != num2) {
			System.out.println("num1 and num2 are not equal");
		} else {
			System.out.println("num1 and num2 are equal");
		}

		if (num1 > num2) {
			System.out.println("num1 is greater than num2");
		} else {
			System.out.println("num1 is not greater than num2");
		}

		if (num1 >= num2) {
			System.out.println("num1 is greater than or equal to num2");
		} else {
			System.out.println("num1 is less than num2");
		}

		if (num1 < num2) {
			System.out.println("num1 is less than num2");
		} else {
			System.out.println("num1 is not less than num2");
		}

		if (num1 <= num2) {
			System.out.println("num1 is less than or equal to num2");
		} else {
			System.out.println("num1 is greater than num2");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operators op = new Operators();
		op.ArithmeticOperator();
		op.AssignmentOperator();
		op.AutoOperator();
		op.LogicalOperator();
		op.RelationalOperator();
	}

}
