
public class Ex3_7 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);  // byte 범위 -128 ~ 127 = 256
		System.out.println(300 / 256); // 몫:1 , 나머지:44
//		0부터 127까지 127칸 + 1칸가면 -128 이렇게 설명하면 더 헷갈릴텐데 ㅠ 음음..
//		책에서 그냥 32비트 2진수로 변환후 8비트로 짤라서 나머지는 버려지는식으로 보여주면 헷갈리지 않구나!
		System.out.println(c);	
	}
}
