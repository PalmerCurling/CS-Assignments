public class Party{
	public static void main(String[] args){

		double people = (int) IO.readDouble();
		double slices = (int) IO.readDouble();
		double cans = (int) IO.readDouble();
		double pizzaPrice = IO.readDouble();
		double pieSize = (int) IO.readDouble();
		double casePrice = IO.readDouble();
		double caseSize = (int) IO.readDouble();

		if(people <= 0){
			System.out.println("No party? lame. :/");
		}else{
			double q = Math.ceil(people*slices/pieSize);
			double w = Math.ceil(people*cans/caseSize);
			double price = (q*pizzaPrice)+(w*casePrice);
			IO.outputDoubleAnswer(price);
		}
	}
}
