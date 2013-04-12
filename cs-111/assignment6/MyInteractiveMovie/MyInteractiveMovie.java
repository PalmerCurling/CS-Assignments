public class MyInteractiveMovie{
	public static void main(String[] args){
		System.out.println("Please open the source code and ensure your sprite names and sizes are set below.");

		System.out.println("please set the size of the background below:");
		System.out.println("width:");
		int backw = IO.readInt();
		System.out.println("height:");
		int backh = IO.readInt();

		Sprite one = new Sprite("tsukune.png");
		one.setSize(37,76);
		Sprite two = new Sprite("moka1.png");
		two.setSize(37,79);
		Sprite three = new Sprite("kurumu1.png");
		three.setSize(25,79);

		one.setPosition(0,0);
		two.setPosition(80,0);
		three.setPosition(157,0);

		Animation interactive = new Animation(backw,backh);
		interactive.setFrameRate(1);
		interactive.setBackgroundImage("background.jpg");
		interactive.addSprite(one);
		interactive.addSprite(two);
		interactive.addSprite(three);

		boolean loop = true;
		interactive.frameFinished();

		do{

			int x = 0;
			int y = 0;
			int z = 0;
			int q = 0;
			int choice;
			System.out.println("What would you like to do?");
			System.out.println("(1) Move a Sprite");
			System.out.println("(2) Quit the program");
			do{
				System.out.println("please select 1 or 2");
				choice = IO.readInt();
			}while(choice<1 || choice>2);
			if(choice == 2){
				System.exit(1);
			}else{
				choice = 0;
				System.out.println("Please select a sprite to move");
				System.out.println("1");
				System.out.println("2");
				System.out.println("3");
				do{
					System.out.println("Please select 1, 2, or 3");
					choice = IO.readInt();
				}while(choice<1 || choice >3);
			} 
			if(choice == 1){
				Menu.Location(one,x,y,z,q,backw,backh);
				x = one.getXsize();
				y = one.getYsize();
				z = one.getXposition();
				q = one.getYposition();
				Menu.Collision(one,x,y,z,q,two,backw,backh);
				Menu.Collision(one,x,y,z,q,three,backw,backh);
				interactive.frameFinished();
			}
			if(choice == 2){
				Menu.Location(two,x,y,z,q,backw,backh);
				x = two.getXsize();
				y = two.getYsize();
				z = two.getXposition();
				q = two.getYposition();
				Menu.Collision(two,x,y,z,q,one,backw,backh);
				Menu.Collision(two,x,y,z,q,three,backw,backh);
				interactive.frameFinished();
			}
			if(choice == 3){
				Menu.Location(three,x,y,z,q,backw,backh);
				x = three.getXsize();
				y = three.getYsize();
				z = three.getXposition();
				q = three.getYposition();
				Menu.Collision(three,x,y,z,q,one,backw,backh);
				Menu.Collision(three,x,y,z,q,two,backw,backh);
				interactive.frameFinished();
			}
		}while(loop = true);
	}
}
