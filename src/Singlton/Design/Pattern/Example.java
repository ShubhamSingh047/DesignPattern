package Singlton.Design.Pattern;

public class Example {
//	
	public static void main(String[] args) {
		Samosa samosa1= Samosa.getSamosa();
		Samosa samosa2=Samosa.getSamosa();
		System.out.println(samosa1==samosa2);
	}
}
