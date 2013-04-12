public class TwoSmallest{
	public static void main(String[] args){

		int terminate = IO.readInt();
		double x;
		double lowest = 0; 
		double second = 0;
		int count = 0;
		do{
			x =IO.readDouble();
			if(x == terminate){
				IO.outputDoubleAnswer(lowest);
				IO.outputDoubleAnswer(second);
				return;
			}
			if(x <=  lowest || count == 0){
				second = lowest;
				lowest = x;
			}
			if(count == 1 && x > lowest ){
				second = x;
			}
			if(count == 1 && x < lowest){
				second = lowest;
				lowest = x;
			}

			count++;		
		}while(x != terminate);
	}
}
