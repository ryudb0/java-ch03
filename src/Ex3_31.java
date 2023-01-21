
public class Ex3_31 {
	public static void main(String[] args) {
		int dec = 1234;
		int hex = 0xABCD;
		int mask = 0xf;
		
		System.out.printf("hex=%#X%n", hex);
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		System.out.printf("dec=%d%n", dec);
		System.out.printf("%X%n", dec & mask);
		System.out.println(Integer.toBinaryString(dec));
	}

}
