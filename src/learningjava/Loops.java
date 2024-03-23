package learningjava;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The while Loop:
		int x = 10;
		while (x <= 15) {
			System.out.println("Jesus is God ");
			x++;
		}
		// do while loop
		int y = 14;
		do {
			System.out.print("value of y : " + y);
			y++;
			System.out.print("\n");
		} while (y <= 13);
		System.out.println("y is not less than 13 ");

		// for loop

		for (int j = 1; j > 10; j++) {
			System.out.println(j);
		}
		System.out.println("j is less than 10");
		
		//continue statment 
		for (int k = 1; k <= 10; k++) {
		      if (k == 5) {
		        continue;
		      }
		      System.out.println(k);
		    }
		//break statment 
		
	}

}
