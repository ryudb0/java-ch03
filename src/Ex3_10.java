
public class Ex3_10 {
	public static void main(String[] args) {
		int a = 1_000_000;
		
		int result1 = a * a / a;
		int result2 = a / a * a;
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
		
	}

}
