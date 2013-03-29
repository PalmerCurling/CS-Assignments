public class MatrixOps{
	public static double[][] multiply(double[][] matrix1, double[][] matrix2){
		
		double[][] sum;
		int row1 = matrix1.length;
		int column1 = matrix1[0].length;
		int row2 = matrix2.length;
		int column2 = matrix2[0].length; 
		
		if(column1 != row2){
			return null;
		}else{
			sum = new double[row1][column2];
			for(int i = 0; i < row1; i++){
				for(int j = 0; i < column2; j++){
					for(int k = 0; k < column1; k++){
						sum[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				}
			}
			return sum;
		}
	}
}
