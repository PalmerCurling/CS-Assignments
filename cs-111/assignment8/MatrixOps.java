public class MatrixOps{
	public static double[][] multiply(double[][] matrix1, double[][] matrix2){
		double[][] sum;
		int row = matrix2.length;
		int column = matrix1[0].length;

		if(column != row){
			return null;
		}else{
			sum = new double[row][column];
			for(int i = 0; i < row; i++){
				for(int j = 0; i < column; j++){
					sum[i][j] = 0;
					for(int k = 0; k < row; k++){
						sum[i][k] += (matrix1[i][k] * matrix2[k][j]);
					}
				}

			}

			return sum;
		}
	}
}
