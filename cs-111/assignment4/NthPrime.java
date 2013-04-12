public class NthPrime{
	public static void main(String[] args){
		int x = IO.readInt();

		if(x<1)
		do{
			IO.reportBadInput();
			x = IO.readInt();
		}while(x<1);
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
				count++;
			}
		}
		IO.outputIntAnswer(prime);

	}
}
