
public class Ex3_8 {
	public static void main(String[] args) {
		int a = 1_000_000;		// 1백만
		int b = 2_000_000;		// 2백만
		
		long c = a * b;			// int * int 에서 결과도 int 다 여기서 int값의 범위를 벗어나 의도한 값이 들어가지 않았다.
		System.out.println(c);
	}
}
