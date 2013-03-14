public class MyMovie{
	public static void main(String args[]){
		System.out.println("Please ensure the following images are included in the directory this program is being run from:");
		System.out.println("tsukune.jpg");
		System.out.println("moka1.jpg");
		System.out.println("moka2.jpg");
		System.out.println("moka3.jpg");
		System.out.println("moka4.jpg");
		System.out.println("background.jpg");
		System.out.println("kurumu1.jpg");
		System.out.println("kurumu2.jpg");
		System.out.println("kurumu3.jpg");
		System.out.println("kurumu4.jpg");
		System.out.println("Now loading: Rosario+Vampire: Java Battle");

		Sprite moka1 = new Sprite("moka1.jpg");
		Sprite moka2 = new Sprite("moka2.jpg");
		Sprite moka3 = new Sprite("moka3.jpg");
		Sprite tsukune = new Sprite("tsukune.jpg");
		Sprite moka4 = new Sprite("moka4.jpg");
		Sprite kurumu1 = new Sprite("kurumu1.jpg");
	}
}
