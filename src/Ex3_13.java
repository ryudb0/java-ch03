public class Ex3_13 {
	public static void main(String[] args) {
		char c1 = 'a';
		
//		char c2 = c1 +1;		// char + int = int
//		char c2 = (char)(c1 +1)  이렇게 바꿔주면 된다.
		
		char c2 = 'a' + 1;		// 리터럴 + int = ?
//					리터럴 + 리터럴 
//		컴파일러가 변수에들어가있는건 미리 계산할수가 없다.
		
		System.out.println(c2); // 'b'
	}
}
