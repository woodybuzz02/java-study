package ch03;

public class ExampleEx01 {
	
	static double calc(double gasoline, double distance) {
		return (int)(distance/gasoline);
	}

	public static void main(String[] args) {
		double gasoline = 8.86;
		double distance = 182.736;
		double effiency = calc(gasoline, distance);
		System.out.println("���� : "+effiency+" km/L");

	}

}
