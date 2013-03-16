public class Menu{
	public static void Location(Sprite spritename){
		System.out.println("Please indicate which direction you would like to move the sprite.");
		int r;
		boolean check = false;
		String direction = " ";
		System.out.println("up");
		System.out.println("down");
		System.out.println("left");
		System.out.println("right");
		do{
			direction = IO.readString();
			direction = direction.toLowerCase();
			if(direction.equals("up") || direction.equals("down") || direction.equals("left") || direction.equals("right")){

				check = true;
			}
		}while(check = false);
		if(direction == "up"){
			System.out.println("how many pixels do you want to move?");
			do{
				r = IO.readInt();
			}while(r > 1000);

		}
		if(direction == "down"){

		}
		if(direction == "left"){

		}
		if(direction == "right"){

		}
	}
}
