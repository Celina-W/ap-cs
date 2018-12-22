import java.util.Scanner;

public class GCD {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first number, q to quit: ");
		
		// repeat all as long as inputs are integers
		while (in.hasNextDouble()) {
			
			int num1 = Math.abs(in.nextInt());
			
			System.out.print("Enter the second number, q to quit: ");
			
			// continue only if second input is an integer
			if (in.hasNextDouble()) {
				
				int num2 = Math.abs(in.nextInt());
				
				while (num1 > 0 && num2 > 0 && num1 != num2) {
					if (num1 > num2) {
						num1 -= num2;
					}
					else {
						num2 -= num1;
					}
				}
				
				if (num1 == num2 || num2 == 0) {
					System.out.println("The GCD is: " + num1);
				}
				else {
					System.out.println("The GCD is: " + num2);
				}
				
				System.out.print("Enter the first number, q to quit: ");
				
			}
			
		}
		
		in.close();
		
	}
	
}
