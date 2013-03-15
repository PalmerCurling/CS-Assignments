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
		System.out.println("Credit to agrs700 for the sprites!");
		System.out.println("Now loading: Rosario+Vampire: Java Battle");

		Sprite moka1 = new Sprite("moka1.jpg");
		Sprite moka2 = new Sprite("moka2.jpg");
		Sprite moka3 = new Sprite("moka3.jpg");
		Sprite moka4 = new Sprite("moka4.jpg");
		Sprite tsukune = new Sprite("tsukune.jpg");
		Sprite kurumu1 = new Sprite("kurumu1.jpg");
		Sprite kurumu2 = new Sprite("kurumu2.jpg");
		Sprite kurumu3 = new Sprite("kurumu3.jpg");
		Sprite kurumu4 = new Sprite("kurumu4.jpg");

		moka1.setSize(37,79);
		moka2.setSize(38,81);
		moka3.setSize(55,65);
		moka4.setSize(85,64);
		tsukune.setSize(37,76);
		kurumu1.setSize(25,79);
		kurumu2.setSize(87,85);
		kurumu3.setSize(94,74);
		kurumu4.setSize(70,75);

		Animation fight = new Animation(800,450);
		fight.setFrameRate(1);
		fight.setBackgroundImage("background.jpg");

		moka1.setPosition(0,0);
		kurumu1.setPosition((800-76),0);
		tsukune.setPosition((40),0);
		fight.addSprite(moka1);
		fight.addSprite(kurumu1);
		fight.addSprite(tsukune);
		fight.frameFinished();

	}
}
