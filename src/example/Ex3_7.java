package example;

public class Ex3_7 {
	public static void main(String[] args) {
//		C = 5/9 *(F-32)
		int fahrenheit = 100;
		float celcius = (int)((5f/9*(fahrenheit-32))*100+0.5f)/100f;
		
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		
		
	}

}
