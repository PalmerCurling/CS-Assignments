public class MyInteractiveMovie{
	public static void main(String[] args){
		System.out.println("Please open the source code and ensure your sprite names and sizes are set below.");
		Sprite one = new Sprite("<first file>");
		one.setSize(0,0);
		Sprite two = new Sprite("<second file>");
		two.setSize(0,0);
		Sprite three = new Sprite("<third file>");
		three.setSize(0,0);
		Animation interactive = new Animation(1000,1000);
		interactive.setFrameRate(1);
		interactive.setBackgroundImage("background.jpg");

		boolean loop = true;

		do{
			int choice;
			System.out.println("What would you like to do?");
			System.out.println("(1) Move a Sprite");
			System.out.println("(2) Quit the program");
			do{
				System.out.println("please select 1 or 2");
				choice = IO.readInt();
			}while(choice<1 || choice>2);
			if(choice == 2){
				return;
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
				Menu.Location(one);
			}
			if(choice == 2){
				Menu.Location(two);
			}
			if(choice == 3){
				Menu.Location(three);
			}
		}while(loop = true);
	}
}
