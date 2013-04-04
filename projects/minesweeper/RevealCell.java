public class RevealCell{
	// so yeah file named reveal cell...
	public static char[][] revealCell(char[][]staticBoard, char[][] dynamicBoard, int[] choice){
		// but wtf does this method do??
		dynamicBoard[choice[0]][choice[1]] = staticBoard[choice[0]][choice[1]];
		return dynamicBoard;
	}
}
