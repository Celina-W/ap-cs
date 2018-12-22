public class BalloonTester {

	public static void main(String[] args) {

		Balloon balloon = new Balloon();
		
		balloon.addAir(100);
		System.out.println(balloon.getVolume());
		System.out.println(balloon.getSurfaceArea());
		System.out.println(balloon.getRadius());
		
		balloon.addAir(100);
		System.out.println(balloon.getVolume());
		System.out.println(balloon.getSurfaceArea());
		System.out.println(balloon.getRadius());

	}

}

/*
	Expected output:
	100.0
	104.23...
	2.88...
	200.0
	165.59...
	3.63...
*/

/*
	Actual output:
	100.0
	104.18794157356089
	2.8794119114848606
	200.0
	165.38804805627188
	3.6278316785978095
*/