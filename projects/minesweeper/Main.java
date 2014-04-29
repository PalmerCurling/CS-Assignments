public class Main{
	public static void main(String[] args){

<<<<<<< HEAD
		char[][] staticBoard = {{'1','1','2','1','1'},
			{'1','B','3','B','1'},
			{'1','2','B','2','1'},
			{'0','3','B','3','0'},
			{'0','2','B','2','0'}};

		char[][] dynamicBoard = {{'x','x','x','x','x'},
			{'x','x','x','x','x'},
			{'x','x','x','x','x'},
			{'x','x','x','x','x'},
			{'x','x','x','x','x'}};
=======
		char[][] staticBoard =
			{{' ',' ',' ',' ',' ',' ',' '},
			{' ','1','1','2','1','1',' '},
			{' ','1','F','3','F','1',' '},
			{' ','1','2','F','2','1',' '},
			{' ','0','3','F','3','0',' '},
			{' ','0','2','F','2','0',' '},
			{' ',' ',' ',' ',' ',' ',' '}};

		char[][] dynamicBoard = {{' ',' ',' ',' ',' ',' ',' '},
			{' ','x','x','x','x','x',' '},
			{' ','x','x','x','x','x',' '},
			{' ','x','x','x','x','x',' '},
			{' ','x','x','x','x','x',' '},
			{' ','x','x','x','x','x',' '},
			{' ',' ',' ',' ',' ',' ',' '}};
>>>>>>> 0a5726cc4b68bfbe793c66b7d5b2452c75f7ba32

		int row, column, i, j;
		boolean loop, flag;


		do{
			System.out.println("Do you wish to flag a square?");
			flag = IO.readBoolean();

			System.out.println("First, a # for column, then for row");
			System.out.println("Please select a square you wish to reveal/flag.");
			do{
				System.out.println("Select a column from 1 to 5");
				column = IO.readInt();
			}while(column < 1 || column > 5);
			do{
				System.out.println("Select a row from 1 to 5");
				row = IO.readInt();
			}while(row < 1 || row > 5);
<<<<<<< HEAD
			column = column - 1;
			row = row - 1;
			int[] selection = {row,column};
			if(flag){
				dynamicBoard[selection[0]][selection[1]] = 'F';
			}

			boolean result = PrintBoard.printBoard(staticBoard, selection, dynamicBoard, flag);
=======


			if(dynamicBoard[row][column] != 'x'){
				System.out.println("This square has already been clicked or flagged; please select a different location");
				continue;
			}
			if(flag){
				dynamicBoard[row][column] = 'F';
			}

			boolean result = PrintBoard.printBoard(staticBoard, row, column, dynamicBoard, flag);
>>>>>>> 0a5726cc4b68bfbe793c66b7d5b2452c75f7ba32
			if(result){
				System.out.println("you lose!");
				System.exit(1);
			}else{
<<<<<<< HEAD
				System.out.println("you have survived so far!");
			}

		}while(loop = true);
=======
				boolean win = true;

				for(i = 0; i < staticBoard[0].length; i++){
					for(j = 0; j < staticBoard.length; j++){
						if(staticBoard[i][j] != dynamicBoard[i][j]){
							win = false;
						}
					}
				}
				if(win){
					System.out.println("You win!");
					System.exit(2);
				}else{
					System.out.println("you have survived so far!");
				}
			}

			}while(loop = true);		
>>>>>>> 0a5726cc4b68bfbe793c66b7d5b2452c75f7ba32
	}
}
