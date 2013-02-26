public class Scores{
	public static void main(String[] args){
		int judges = 0;
		do{
			judges = IO.readInt();
			if(judges < 3){
				IO.reportBadInput();
				continue;
			}
		}while(judges < 3);
		int count = 0;
		double total = 0;
		double a = 0;
		double b = 0;
		double highest = 0;
		double lowest = 10;
		double x = 0;

		do{
			x = IO.readDouble();

			if(x<=10 && x>=0){
				if(x>highest){
					highest = x;
				}
				if(x<lowest){
					lowest = x;
				}
			}else{
				IO.reportBadInput();
				continue;
			}
			total  = total+x;
			count++;
		}while(count < judges);

		a = total - highest - lowest;
		b = judges - 2;
		IO.outputDoubleAnswer(a/b);
	}
}
