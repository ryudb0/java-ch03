package example;

public class Ex3_1 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';    // 'A'의 문자코드는 65
		
		System.out.println(1 +x <<33);					// 5  -> 틀림 덧셈연산자가 쉬프트연산자보다 우선순위가 더 높다.
		System.out.println(y >= 5 || x <0 && x >2);		// t
		System.out.println(y += 10 - x++);				// 13, y = 15, x = 3 
		System.out.println(x +=2);						// 5, x=5
		System.out.println(!('A' <= c && c<= 'Z'));		// f
		System.out.println('C' - c);					// 2
		System.out.println('5' - '0');					// 5
		System.out.println(c+1);						// 66
		System.out.println(++c);						// B
		System.out.println(c++);						// B
		System.out.println(c);							// C
		
		
	}

}
