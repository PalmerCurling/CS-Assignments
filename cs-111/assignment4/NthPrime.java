public class NthPrime{
	public static void main(String[] args){
		int x = IO.readInt();
		while(x < 1){
			IO.reportBadInput();
			x = IO.readInt();
		}
		int prime = 1;
		int count = 0;
		int y;
		while(count<x){
			prime=prime+1;
			for(y = 2; y <= prime; y++){
				if(prime % y == 0){
					break;
				}
			}
			if(y == prime){
				count = count+1;
			}
		}
		IO.outputIntAnswer(prime);

	}
}
