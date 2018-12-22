public class DebaserTester {

	public static void main(String[] args) {
		// (Written by Marin Hyatt)
		//Testing the constructors, .getValue() and .setValue()
		Debaser debaser0 = new Debaser();
		System.out.println(debaser0.getValue());
		debaser0.setValue(10);
		System.out.println(debaser0.getValue());
		
		Debaser debaser1 = new Debaser(10);
		System.out.println(debaser1.getValue());
		debaser1.setValue(0);
		System.out.println(debaser1.getValue());
		
			
		// Testing the convertToBaseTen method
		Debaser debaserTen2 = new Debaser(111111);
		System.out.println("111111 in base 2 is 63 in base 10.");
		System.out.println("The result of using Debaser is: " + debaserTen2.convertToBaseTen(2));
			
		Debaser debaserTen3 = new Debaser(22222);
		System.out.println("2222 in base 3 is 242 in base 10.");
		System.out.println("The result of using Debaser is: " + debaserTen3.convertToBaseTen(3));
			
		Debaser debaserTen4 = new Debaser(3333);
		System.out.println("3333 in base 4 is 255 in base 10.");
		System.out.println("The result of using Debaser is: " + debaserTen4.convertToBaseTen(4));
		
		Debaser debaserTen5 = new Debaser(4444);
		System.out.println("4444 in base 5 is 624 in base 10.");
		System.out.println("The result of using Debaser is: " + debaserTen5.convertToBaseTen(5));
		
		Debaser debaserTen6 = new Debaser(5555);
		System.out.println("5555 in base 6 is 1295 in base 10.");
		System.out.println("The result of using Debaser is: " + debaserTen6.convertToBaseTen(6));
		
		Debaser debaserTen7 = new Debaser(6666);
		System.out.println("6666 in base 7 is 2400 in base 10.");
		System.out.println("The result of using Debaser is: " + debaserTen7.convertToBaseTen(7));
		
		Debaser debaserTen8 = new Debaser(7777);
		System.out.println("7777 in base 8 is 4095 in base 10.");
		System.out.println("The result of using Debaser is: " + debaserTen8.convertToBaseTen(8));
		
		Debaser debaserTen9 = new Debaser(8888);
		System.out.println("8888 in base 9 is 6560 in base 10.");
		System.out.println("The result of using Debaser is: " + debaserTen9.convertToBaseTen(9));
			
		// Testing the convertToBaseN method
		Debaser debaserN2 = new Debaser(63);
		System.out.println("63 in base 10 is 111111 in base 2.");
		System.out.println("The result of using Debaser is: " + debaserN2.convertToBaseN(2));
			
		Debaser debaserN3 = new Debaser(242);
		System.out.println("242 in base 10 is 22222 in base 3.");
		System.out.println("The result of using Debaser is: " + debaserN3.convertToBaseN(3));
			
		Debaser debaserN4 = new Debaser(255);
		System.out.println("255 in base 10 is 3333 in base 4.");
		System.out.println("The result of using Debaser is: " + debaserN4.convertToBaseN(4));
			
		Debaser debaserN5 = new Debaser(624);
		System.out.println("624 in base 10 is 4444 in base 5.");
		System.out.println("The result of using Debaser is: " + debaserN5.convertToBaseN(5));
			
		Debaser debaserN6 = new Debaser(1295);
		System.out.println("1295 in base 10 is 5555 in base 6.");
		System.out.println("The result of using Debaser is: " + debaserN6.convertToBaseN(6));
			
		Debaser debaserN7 = new Debaser(2400);
		System.out.println("2400 in base 10 is 6666 in base 7.");
		System.out.println("The result of using Debaser is: " + debaserN7.convertToBaseN(7));
			
		Debaser debaserN8 = new Debaser(4095);
		System.out.println("4095 in base 10 is 7777 in base 8.");
		System.out.println("The result of using Debaser is: " + debaserN8.convertToBaseN(8));
			
		Debaser debaserN9 = new Debaser(6560);
		System.out.println("6560 in base 10 is 8888 in base 9.");
		System.out.println("The result of using Debaser is: " + debaserN9.convertToBaseN(9));
			

	}
}	
