import java.util.Random;

public class RandomPrice {

	public static void main(String[] args) {
		
		Random generator = new Random();
		double price = generator.nextInt(10) + 10 + generator.nextDouble();
		System.out.printf("Price: %3.2f", price);
		
	}

}
