public class Menu{
	public static void Location(Sprite spritename,int x,int y,int z,int q,int backw,int backh){
		System.out.println("Please indicate which direction you would like to move the sprite.");

		int p;
		boolean check = true;

		System.out.println("up");
		System.out.println("down");
		System.out.println("left");
		System.out.println("right");
		do{
			String direction = IO.readString();
			String merp = direction.toLowerCase();
			if(merp.equals("up")){
				System.out.println("how many pixels do you want to move?");
				do{
					p = IO.readInt();
				}while(p + y + q > backh);
				spritename.setPosition(z,q+p);
				check = false;
			}
			if(merp.equals("down")){
				System.out.println("how many pixels do you want to move?");
				do{
					p = IO.readInt();
				}while(0>q-p);
				spritename.setPosition(z,q-p);
				check = false;
			}
			if(merp.equals("left")){
				System.out.println("how many pixels do you want to move?");
				do{
					p = IO.readInt();
				}while(0>z-p);
				spritename.setPosition(z-p,q);
				check = false;
			}
			if(merp.equals("right")){
				System.out.println("how many pixels do you want to move?");
				do{
					p = IO.readInt();
				}while(p + x + z > backw);
				spritename.setPosition(z+p,q);
				check = false;
			}else{
				System.out.println("please select one of the above listed options");
				continue;
			}
		}while(check);
	}
	public static void Collision(Sprite spritename,int x,int y,int z,int q,Sprite test,int backw,int backh){
		int a = test.getXposition();
		int b = test.getXsize();
		boolean derp = false;
		boolean herp = false;
		System.out.println("checking for x collisions");
		for(int i = z;i<(z+x);i++){
			for(int count = a;count<(a+b);count++){
				if(i==count && !derp){
					System.out.println("found an x collision");
					derp = true;
				}
			}
		}

		System.out.print(derp);
		if(derp){
			a = test.getYposition();
			b = test.getYsize();
			System.out.println("checking for y collisions");
			for(int i = q; i<(q+y);i++){
				for(int count = a;count<(a+b);count++){
					if(i==count && !herp){
						System.out.println("found a y collision");
						herp = true;
					}
				}
			}
			if(herp){
				System.out.println("please do not allow sprites to collide");
				Menu.Location(spritename,x,y,z,q,backw,backh);
			}
		}
	}
}
