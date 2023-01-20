
public class Ex3_14 {
	public static void main(String[] args) {
		char c = 'a';
		for(int i=0; i<26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		System.out.println(c);
		
		c = 'A';
		for(int i=0; i<26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		System.out.println(c);
		
		c='0';
		for(int i=0; i<10; i++) {
			System.out.print(c++);
		}
		System.out.println();
		System.out.println(c);
	}
}
