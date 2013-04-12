public class Main{
	public static void main(String[] args){

		char[][] staticBoard =
			{{' ',' ',' ',' ',' ',' ',' '},
			{' ','1','1','2','1','1',' '},
			{' ','1','B','3','B','1',' '},
			{' ','1','2','B','2','1',' '},
			{' ','0','3','B','3','0',' '},
			{' ','0','2','B','2','0',' '},
			{' ',' ',' ',' ',' ',' ',' '}};

		char[][] dynamicBoard = {{' ',' ',' ',' ',' ',' ',' '},
			{' ','x','x','x','x','x',' '},
			{' ','x','x','x','x','x',' '},
			{' ','x','x','x','x','x',' '},
			{' ','x','x','x','x','x',' '},
			{' ','x','x','x','x','x',' '},
			{' ',' ',' ',' ',' ',' ',' '}};

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

			
			if(dynamicBoard[row][column] != 'x'){
				System.out.println("This square has already been clicked or flagged; please select a different location");
				continue;
			}
			if(flag){
				dynamicBoard[row][column] = 'F';
			}

			boolean result = PrintBoard.printBoard(staticBoard, row, column, dynamicBoard, flag);
			if(result){
				System.out.println("you lose!");
				System.exit(1);
			}else{
				System.out.println("you have survived so far!");
			}

		}while(loop = true);
	}
}
