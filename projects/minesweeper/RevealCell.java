public class RevealCell{
	public static char[][] revealCell(char[][]staticBoard, char[][] dynamicBoard, int[] choice){
		dynamicBoard[choice[0]][choice[1]] = staticBoard[choice[0]][choice[1]];
		return dynamicBoard;
	}
}
