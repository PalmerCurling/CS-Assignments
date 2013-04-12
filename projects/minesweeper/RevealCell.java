public class RevealCell{
	public static char[][] revealCell(char[][]staticBoard, char[][] dynamicBoard, int row, int column){

		int cascR;
		int cascC;

		if(dynamicBoard[row][column] == ' '){
			return dynamicBoard;
		}
		if(dynamicBoard[row][column] == 'x'){
			dynamicBoard[row][column] = staticBoard[row][column];
			if(dynamicBoard[row][column] == '0'){
				int i, j;
				for(i = -1; i < 2; i++){
					cascR = row + i;
					for(j = -1; j < 2; j++){
						cascC = column + j;
						dynamicBoard = RevealCell.revealCell(staticBoard, dynamicBoard, cascR, cascC);
					}
				}
				return dynamicBoard;
			}
		}
		return dynamicBoard;
	}
}
