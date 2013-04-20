public class Board{

	public MsGUI gui;

	char[][] dynamicBoard = {{' ',' ',' ',' ',' ',' ',' '},
		{' ','x','x','x','x','x',' '},
		{' ','x','x','x','x','x',' '},
		{' ','x','x','x','x','x',' '},
		{' ','x','x','x','x','x',' '},
		{' ','x','x','x','x','x',' '},
		{' ',' ',' ',' ',' ',' ',' '}};

	char[][] staticBoard = {{' ',' ',' ',' ',' ',' ',' '},
		{' ','1','1','2','1','1',' '},
		{' ','1','F','3','F','1',' '},
		{' ','1','3','F','3','1',' '},
		{' ','0','3','F','3','0',' '},
		{' ','0','2','F','2','0',' '},
		{' ',' ',' ',' ',' ',' ',' '}};

	public Board(){}

	public boolean isFlagged(int row, int col){
		if(dynamicBoard[row][col] == 'F'){
			return true;
		}else{
			return false;
		}
	}

	public int getHeight(){
		int height = dynamicBoard[0].length;
		height = height - 1;
		return height;
	}

	public int getWidth(){
		int width = dynamicBoard.length;
		width = width - 1;
		return width;
	}

	public char getValue(int row, int col){
		char r = dynamicBoard[row][col];
		return r;
	}

	public void revealCell(int row, int col){
		int cascR, cascC;
		if(dynamicBoard[row][col] == ' '){
		}
		if(dynamicBoard[row][col] == 'x'){
			dynamicBoard[row][col] = staticBoard[row][col];
			if(dynamicBoard[row][col] == '0'){
				int i, j;
				for(i = -1; i < 2; i++){
					cascR = row + i;
					for(j = -1; j < 2; j++){
						cascC = col + j;
						revealCell(cascR, cascC);
					}
				}
			}
		}
		int i, j;
		boolean win = true;
		if(staticBoard[row][col] == 'F'){
			for(i = 0; i < staticBoard[0].length; i++){
				for(j = 0; j < staticBoard.length; j++){
					if(staticBoard[i][j] == 'F'){
						dynamicBoard[i][j] = 'B';
					}
				}
			}
			gui.lose("You have lost :(");
		}else{
			for(i = 0; i < staticBoard[0].length; i++){
				for(j = 0; j < staticBoard.length; j++){
					if(staticBoard[i][j] != dynamicBoard[i][j]){
						win = false;
					}
				}
			}
			if(win){
				gui.win("You have won! :D");
			}
		}
	}

	public void flagCell(int row, int col){
		dynamicBoard[row][col] = 'F';
	}

	public void unflagCell(int row, int col){
		dynamicBoard[row][col] = 'x';
	}

	public static void main(String args[]){
		Board b = new Board();
		b.gui = new MsGUI(b);
		b.gui.setVisible(true);
	}
}
