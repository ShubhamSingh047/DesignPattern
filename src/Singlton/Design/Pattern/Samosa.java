package Singlton.Design.Pattern;

public class Samosa {
	private static Samosa samosa;
	
	//contructor
	private Samosa() {
		
	}
	
	public static Samosa getSamosa() {
		if(samosa==null) {
			samosa=new Samosa();
		}
		return samosa;
	}
}
