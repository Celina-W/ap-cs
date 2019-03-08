import java.util.Scanner;

public class StringStuff {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		String name = in.next();
		
		System.out.println("hey \"" + name + "\".\nhow's it going \"" + name + "\".");
		System.out.println("sure that's your real name, \"" + name + "\"...?");
		
		System.out.print("What is your real, full name?: ");
		name = in.nextLine();
		in.close();
		
		System.out.println("hello, \"" + name + "\".\nhow is it hanging, \"" + name + "\".");
		System.out.println("Are you sure that isn't a fake name, \"" + name + "\"...?");
		
		System.out.printf("%10.0f", 1.2);
		
		System.out.println("Are there any spaces and periods at the end?.     ".trim());
		
	}

}
