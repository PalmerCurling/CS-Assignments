public class MatrixOps{
	public static double[][] multiply(double[][] matrix1, double[][] matrix2){

		if(matrix1[0].length != matrix2.length){
			return null;
		}else{

			int n = matrix1[0].length;
			int m = matrix1.length;
			int p = matrix2[0].length;

			double ans[][] = new double[m][p];

			for(int i = 0; i < m; i++){
				for(int j = 0; j < p; j++){
					for(int k = 0; k < n; k++){
						ans[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				}
			}
			return ans;
		}
	}
}
