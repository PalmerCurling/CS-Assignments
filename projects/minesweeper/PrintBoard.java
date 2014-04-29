public class PrintBoard{
<<<<<<< HEAD
	public static boolean printBoard(char[][] staticBoard, int[] choice, char[][] dynamicBoard, boolean flag){
=======
	public static boolean printBoard(char[][] staticBoard, int row, int column, char[][] dynamicBoard, boolean flag){
>>>>>>> 0a5726cc4b68bfbe793c66b7d5b2452c75f7ba32
		boolean bomb;
		int i = 0 , j = 0;

		if(flag){
			bomb = false;
		}else{
<<<<<<< HEAD
			dynamicBoard = RevealCell.revealCell(staticBoard, dynamicBoard, choice);

			if(staticBoard[choice[0]][choice[1]] == 'B'){
=======
			dynamicBoard = RevealCell.revealCell(staticBoard, dynamicBoard, row, column);

			if(staticBoard[row][column] == 'F'){
>>>>>>> 0a5726cc4b68bfbe793c66b7d5b2452c75f7ba32
				bomb  = true;
			}else{
				bomb = false;
			}
		}

		for(i = 0; i < staticBoard[0].length; i++){
			System.out.println(" ");
			for(j = 0; j < staticBoard.length; j++){
				System.out.print(dynamicBoard[i][j]);
			}
		}
		System.out.println(" ");
		return bomb;
	}
}
