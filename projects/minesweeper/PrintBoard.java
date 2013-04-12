public class PrintBoard{
	public static boolean printBoard(char[][] staticBoard, int[] choice, char[][] dynamicBoard, boolean flag){
<<<<<<< HEAD

=======
		//please start adding comments to your code! sometimes it is for me to understand it
>>>>>>> cd1f52718a99ecce68fa97e161bc7bd07b97d89f
		boolean bomb;
		int i = 0 , j = 0;

		if(flag){
			bomb = false;
		}else{
			dynamicBoard = RevealCell.revealCell(staticBoard, dynamicBoard, choice);

			if(staticBoard[choice[0]][choice[1]] == 'B'){
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
