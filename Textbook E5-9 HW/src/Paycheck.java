import java.util.Scanner;

public class Paycheck {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = in.nextLine();
		System.out.print("Enter salary: ");
		double salary = in.nextDouble();
		System.out.print("Enter hours worked in past week: ");
		double hours = in.nextDouble();
		in.close();
		
		if (hours < 40) {
			System.out.printf("%s   $%.2f", name, salary * hours);
		}
		else {
			System.out.printf("%s   $%.2f", name, salary * 40 + salary * 1.5 * (hours - 40));
		}
		
	}

}

/*
Sample Input:
Enter name: Bobartha Jenkins
Enter salary: 15.49
Enter hours worked in past week: 32.3

Expected Output:
Bobartha Jenkins   $500.33

Actual Output:
Bobartha Jenkins   $500.33

Sample Input:
	Enter name: Bobartha Jenkins
	Enter salary: 15.49
	Enter hours worked in past week: 57.35

Expected Output:
Bobartha Jenkins   $1022.73

Actual Output:
Bobartha Jenkins   $1022.73
*/