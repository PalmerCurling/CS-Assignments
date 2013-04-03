public class Main{
	public static void main(String[] args){

		System.out.println("Welcome to Java Minesweeper!");
		System.out.println("Please select an option below:");
		System.out.println("(1) Play a game of Minesweeper");
		System.out.println("(2) Quit");

		int choice, column, row;
		boolean loop;

		do{
			choice = IO.readInt();
		}while(choice < 1 || choice > 2);

		if(choice == 2){
			System.exit(1);
		}else{
			char[][] staticBoard = {{'1','1','2','1','1'},
				{'1','B','3','B','1'},
				{'1','2','B','2','1'},
				{'0','3','B','3','0'},
				{'0','2','B','2','0'}};
		}
		do{
			System.out.println("First, a letter for column, then a number for row");
			System.out.println("Please select a space you wish to reveal.");
			do{
				column = IO.readInt();
			}while(column < 1 || column > 5);

			do{
				row = IO.readInt();
			}while(row < 1 || row > 5);

			int[] selection = {column,row};

		}while(loop = true);
	}
}
