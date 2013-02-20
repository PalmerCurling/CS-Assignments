public class OrderCost {
	public static void main(String[] args){
		int x;
		boolean y;
		double z;
		double d;

		System.out.println("How many DVDs do you wish to purchase?");
		x = (int) IO.readDouble();
		System.out.println("Do you wish Superfast delivery (for an additional cost)?");
		y = IO.readBoolean();
		z = x*14.99;
		d = (x*14.99)+(x*.99)+3.99;

		if(x<=0){
			IO.reportBadInput();
			System.exit(-1);
		}else{
			if(y){
				IO.outputDoubleAnswer(z+12.99+(x*4.99));
			}else{
				if(z>=100){
					IO.outputDoubleAnswer(z);
				}else{
					IO.outputDoubleAnswer(d);
				}
			}
		}
	}
}
