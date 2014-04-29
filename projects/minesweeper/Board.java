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
		row = row + 1;
		col = col + 1;
		if(dynamicBoard[row][col] == 'F'){
			return true;
		}else{
			return false;
		}
	}

	public int getHeight(){
		int height = dynamicBoard[0].length;
		height = height - 2;
		return height;
	}

	public int getWidth(){
		int width = dynamicBoard.length;
		width = width - 2;
		return width;
	}

	public char getValue(int row, int col){
		row = row + 1;
		col = col + 1;
		char r = dynamicBoard[row][col];
		return r;
	}

	public void revealCellHelper(int row, int col){
		int i, j;
		int cascR, cascC;
		if(dynamicBoard[row][col] == ' '){
		}
		if(dynamicBoard[row][col] == 'x'){
			dynamicBoard[row][col] = staticBoard[row][col];
			if(dynamicBoard[row][col] == '0'){
				for(i = -1; i < 2; i++){
					cascR = row + i;
					for(j = -1; j < 2; j++){
						cascC = col + j;
						revealCellHelper(cascR, cascC);
					}
				}
			}
		}
		win(row, col, true);
	}

	public void flagCell(int row, int col){
		row = row + 1;
		col = col + 1;
		dynamicBoard[row][col] = 'F';
		win(row, col, false);
	}

	public void unflagCell(int row, int col){
		row = row + 1;
		col = col = 1;
		if(Character.isDigit(dynamicBoard[row][col])){
		}else{
			dynamicBoard[row][col] = 'x';
		}
	}

	public void revealCell(int row, int col){
		row = row + 1;
		col = col + 1;
		int i, j;
		if(Character.isDigit(dynamicBoard[row][col])){
			int count = 0;
			int extended = (int) dynamicBoard[row][col] - 48;
			for(i = -1; i < 2; i++){
				for(j = -1; j < 2; j++){
					if(dynamicBoard[row + i][col + j] == 'F'){
						count++;
					}
				}
			}
			if(count == extended){
				for(i = -1; i < 2; i++){
					for(j = -1; j < 2; j++){
						if(dynamicBoard[row + i][col + j] == 'F'){
						}else{
							revealCellHelper(row + i, col + j);
						}
					}
				}
			}	
		}
		revealCellHelper(row, col);
	}

	public void win(int row, int col, boolean reveal){
		int i, j;
		boolean win = true;
		if(reveal){
			if(staticBoard[row][col] == 'F'){
				for(i = 0; i < staticBoard[0].length; i++){
					for(j = 0; j < staticBoard.length; j++){
						if(staticBoard[i][j] == 'F'){
							dynamicBoard[i][j] = 'B';
						}
					}
				}
				gui.lose("You have lost :(");
			}
		}
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

	public static void main(String args[]){
		Board b = new Board();
		b.gui = new MsGUI(b);
		b.gui.setVisible(true);
	}
}
