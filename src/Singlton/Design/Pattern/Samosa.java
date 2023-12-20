package Singlton.Design.Pattern;

public class Samosa {
	private static Samosa samosa;

	// contructor
	private Samosa() {

	}

	// lazy way of creating
	public static Samosa getSamosa() {
			synchronized (Samosa.class) {
				if (samosa == null) {
					samosa = new Samosa();
				}
				
		}
		return samosa;
	}
}
