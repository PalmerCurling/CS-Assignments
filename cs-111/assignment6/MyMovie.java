public class MyMovie{
	public static void main(String args[]){
		System.out.println("Please ensure the following images are included in the directory this program is being run from:");
		System.out.println("tsukune.png");
		System.out.println("tsukune2.png");
		System.out.println("moka1.png");
		System.out.println("moka2.png");
		System.out.println("moka3.png");
		System.out.println("moka4.png");
		System.out.println("moka5.png");
		System.out.println("moka6.png");
		System.out.println("background.jpg");
		System.out.println("kurumu1.png");
		System.out.println("kurumu2.png");
		System.out.println("kurumu3.png");
		System.out.println("kurumu4.png");
		System.out.println("heart.png");
		System.out.println("Credit to agrs700 for the sprites!");
		System.out.println("Now playing: Rosario+Vampire: Java Battle");

		Sprite moka1 = new Sprite("moka1.png");
		Sprite moka2 = new Sprite("moka2.png");
		Sprite moka3 = new Sprite("moka3.png");
		Sprite moka4 = new Sprite("moka4.png");
		Sprite moka5 = new Sprite("moka5.png");
		Sprite moka6 = new Sprite("moka6.png");
		Sprite tsukune = new Sprite("tsukune.png");
		Sprite tsukune2 = new Sprite("tsukune2.png");
		Sprite kurumu1 = new Sprite("kurumu1.png");
		Sprite kurumu2 = new Sprite("kurumu2.png");
		Sprite kurumu3 = new Sprite("kurumu3.png");
		Sprite kurumu4 = new Sprite("kurumu4.png");
		Sprite heart = new Sprite("heart.png");

		moka1.setSize(37,79);
		moka2.setSize(38,81);
		moka3.setSize(55,65);
		moka4.setSize(85,64);
		moka5.setSize(37,79);
		moka6.setSize(38,81);
		tsukune.setSize(37,76);
		tsukune2.setSize(37,76);
		kurumu1.setSize(25,79);
		kurumu2.setSize(87,85);
		kurumu3.setSize(94,74);
		kurumu4.setSize(70,75);
		heart.setSize(50,50);

		Animation fight = new Animation(800,450);
		fight.setFrameRate(1);
		fight.setBackgroundImage("background.jpg");

		moka1.setPosition(0,0);
		kurumu1.setPosition((800-76),0);
		tsukune.setPosition(40,0);
		fight.addSprite(moka1);
		fight.addSprite(kurumu1);
		fight.addSprite(tsukune);
		fight.frameFinished();

		fight.removeSprite(moka1);
		fight.removeSprite(kurumu1);
		moka2.setPosition(40,0);
		tsukune.setPosition(0,0);
		kurumu2.setPosition((720),80);
		fight.addSprite(kurumu2);
		fight.addSprite(moka2);
		fight.frameFinished();

		fight.removeSprite(moka2);
		fight.removeSprite(kurumu2);
		fight.removeSprite(tsukune);
		moka3.setPosition(45,0);
		kurumu3.setPosition(670,75);
		fight.addSprite(kurumu3);
		fight.addSprite(moka3);
		fight.frameFinished();

		moka3.setPosition(80,0);
		kurumu3.setPosition(600,70);
		fight.frameFinished();

		moka3.setPosition(125,25);
		fight.addSprite(moka3);
		kurumu3.setPosition(530,65);
		fight.frameFinished();

		fight.removeSprite(moka3);
		moka4.setPosition(250,50);
		kurumu3.setPosition(460,55);
		fight.addSprite(moka4);
		fight.frameFinished();
		
		fight.removeSprite(kurumu3);
		moka4.setPosition(270,50);
		fight.removeSprite(kurumu3);
		fight.addSprite(kurumu4);
		kurumu4.setPosition(355,50);
		fight.frameFinished();

		fight.removeSprite(moka4);
		fight.addSprite(moka6);
		moka6.setPosition(270,0);
		kurumu4.setPosition(500,50);
		fight.frameFinished();

		fight.addSprite(tsukune2);
		tsukune2.setPosition(0,0);
		moka6.setPosition(190,0);
		kurumu4.setPosition(600,50);
		fight.frameFinished();

		tsukune2.setPosition(75,0);
		moka6.setPosition(110,0);
		kurumu4.setPosition(700,50);
		fight.frameFinished();

		fight.removeSprite(kurumu4);
		fight.removeSprite(moka6);
		fight.addSprite(moka5);
		moka5.setPosition(110,0);
		fight.frameFinished();

		fight.removeSprite(moka5);
		fight.removeSprite(tsukune2);
		fight.addSprite(tsukune);
		fight.addSprite(moka1);
		moka1.setPosition(110,0);
		tsukune.setPosition(75,0);
		fight.frameFinished();
		
		fight.removeSprite(moka1);
		fight.removeSprite(tsukune);
		fight.addSprite(tsukune2);
		fight.addSprite(moka5);
		fight.addSprite(heart);
		moka5.setPosition(110,0);
		tsukune2.setPosition(75,0);
		heart.setPosition(92,70);
		fight.frameFinished();

		fight.removeSprite(tsukune2);
		fight.addSprite(tsukune);
		tsukune.setPosition(0,0);
		moka5.setPosition(40,0);
		heart.setPosition(38,70);
		fight.frameFinished();

		fight.removeSprite(tsukune);
		fight.removeSprite(heart);
		fight.removeSprite(moka5);
		fight.frameFinished();



	}
}
