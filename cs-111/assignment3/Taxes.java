public class Taxes{
	public static void main(String[] args){
		double x;
		double s;
		double m;
		double l;
		double g;

		x = (int) IO.readDouble();
		s = x*.10;
		m = ((8000*.10) + ((x-8000)*.15));
		l = ((8000*.10) + (26000*.15) + ((x-34000)*.25));
		g = ((8000*.10) + (26000*.15) + (48000*.25) + ((x-82000)*.35));

		if(x<0){
			IO.reportBadInput();
			System.exit(-1);
		}else{
			if(x<8000){
				IO.outputDoubleAnswer(s);
			}else{
				if(x<=34000){
					IO.outputDoubleAnswer(m);
				}else{
					if(x<=82000){
						IO.outputDoubleAnswer(l);
					}else{
						IO.outputDoubleAnswer(g);
					}
				}
			}
		}
	}
}
