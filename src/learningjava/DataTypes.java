package learningjava;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// DataType Declaration

		byte b = 100;
		short s = 123;
		int i = 123543;
		long long_Val = 1234567891;
		float float_Val = 12.25f;
		double double_Val = 12345.234d;
		boolean boolean_True = true;
		boolean boolean_false = false;
		char char_Val = 'Y';

		// Print Variable Values

		System.out.println("byte Value = " + b);
		System.out.println("short Value = " + s);
		System.out.println("int Value = " + i);
		System.out.println("long Value = " + long_Val);
		System.out.println("float Value = " + float_Val);
		System.out.println("double Value = " + double_Val);
		System.out.println("boolean Value = " + boolean_True);
		System.out.println("boolean Value = " + boolean_false);
		System.out.println("char Value = " + char_Val);
		
		//Non primtive datatypes
		DataTypes demo = new DataTypes();
		String str = new String("fernandes");
		String str2 = "vivian Fernandes";
		System.out.println(str);
		System.out.println(str2);
	}

}
