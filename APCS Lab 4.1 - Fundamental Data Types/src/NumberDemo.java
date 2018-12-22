public class NumberDemo {

	public static void main(String[] args) {
		
		byte byteNum = 8;
		short shortNum = 16;
		int intNum = 32;
		long longNum = 64;
		float floatNum = 32.0f;
		double doubleNum = 64.0;
		char charNum = 'a';
		
		System.out.println("byteNum: " + byteNum);
		System.out.println("shortNum: " + shortNum);
		System.out.println("intNum: " + intNum);
		System.out.println("longNum: " + longNum);
		System.out.println("floatNum: " + floatNum);
		System.out.println("doubleNum: " + doubleNum);
		System.out.println("charNum: " + charNum);
		
		byteNum = 127;
		shortNum = 32767;
		intNum = 2147483647;
		longNum = 9;
		floatNum = 3.2f;
		doubleNum = 17.5406;
		charNum = 'z';
		
		System.out.println("byteNum: " + byteNum);
		System.out.println("shortNum: " + shortNum);
		System.out.println("intNum: " + intNum);
		System.out.println("longNum: " + longNum);
		System.out.println("floatNum: " + floatNum);
		System.out.println("doubleNum: " + doubleNum);
		System.out.println("charNum: " + charNum);
		
		final byte BYTE_BYTES = 8;
		final short SHORT_BYTES = 16;
		final int INT_BYTES = 32;
		final long LONG_BYTES = 64;
		final float FLOAT_BYTES = 32.0f;
		final double DOUBLE_BYTES = 64.0;
		final char CHAR_C = 'c';
		
		System.out.println("BYTE_BYTES: " + BYTE_BYTES);
		System.out.println("SHORT_BYTES: " + SHORT_BYTES);
		System.out.println("INT_BYTES: " + INT_BYTES);
		System.out.println("LONG_BYTES: " + LONG_BYTES);
		System.out.println("FLOAT_BYTES: " + FLOAT_BYTES);
		System.out.println("DOUBLE_BYTES: " + DOUBLE_BYTES);
		System.out.println("CHAR_C: " + CHAR_C);

		/* BYTE_BYTES = 16;
		 * Error:
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			The final local variable BYTE_BYTES cannot be assigned. It must be blank and not using a compound assignment

			at NumberDemo.main(NumberDemo.java:54)
		 */
	}

}
