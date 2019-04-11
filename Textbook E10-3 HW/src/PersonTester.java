public class PersonTester {

	public static void main(String[] args) {
		
		Measurable[] people = { 
				new Person(3.2, "John"),
				new Person(7.8, "Cindy"),
				new Person(1, "Dave")
		};
		
		System.out.println("Expected average height: 4.0");
		System.out.println("Expected tallest person: Cindy");
		
		System.out.println("Actual average height: " + Data.average(people));
		System.out.println("Actual tallest person: " + ((Person) Data.max(people)).getName());

	}

}
