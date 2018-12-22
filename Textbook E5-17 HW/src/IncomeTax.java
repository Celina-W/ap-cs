public class IncomeTax {

	public static void main(String[] args) {
		
		double income = 50000.00;
		double tax;
		
		if (income < 50000) {
			tax = 0.01 * income;
		}
		else if (income < 75000) {
			tax = 0.02 * income;
		}
		else if (income < 100000) {
			tax = 0.03 * income;
		}
		else if (income < 250000) {
			tax = 0.04 * income;
		}
		else if (income < 500000) {
			tax = 0.05 * income;
		}
		else {
			tax = 0.06 * income;
		}

		System.out.printf("Tax: %.2f", tax);

	}

}

// Expected output (50000.00):
// Tax: 1000.00
// Actual output:
// Tax: 1000.00
