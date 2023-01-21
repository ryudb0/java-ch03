
public class Ex3_26 {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n", a, b);		 // a=5, b=0;
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);		// t
		System.out.printf("a=%d, b=%d%n", a, b);	// a=5, b=1
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);  // f
		System.out.printf("a=%d, b=%d%n", a, b);	// a=5, b=2
		
//		효율적인 연산을 하기때문에 왼쪽 결과값에따라 할 필요가 없으면 오른쪽 연산은 하지 않고 넘어간다.
	}

}
