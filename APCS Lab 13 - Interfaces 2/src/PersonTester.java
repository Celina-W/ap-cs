import java.util.Arrays;
import java.util.Scanner;

public class PersonTester {

	public static void main(String[] args) {
		
		final int DEFAULT_HEIGHT = 0;
		
		Person[] people = new Person[10];
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < people.length; i++) {
			System.out.print("Enter a name: ");
			String inputName = in.next();
			people[i] = new Person(DEFAULT_HEIGHT, inputName);
		}
		
		in.close();
		
		Arrays.sort(people);
		
		System.out.printf("First person: %s\nLast person: %s", people[0].getName(), people[9].getName());
		
	}

}
