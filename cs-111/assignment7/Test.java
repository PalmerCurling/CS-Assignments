public class Test{
	public static void main(String[] args){
		boolean loop = true;
		int choice = 0;
		double annualRate = 0;
		int years = 0;
		double principal = 0;

		do{
			System.out.println("What would you like to do?");
			System.out.println("(1) Calculate APY?");
			System.out.println("(2) Calculate loan payment?");
			System.out.println("(3) Quit the program?");
			do{
				choice = IO.readInt();
			}while(choice > 3 || choice < 1);
			if(choice == 1){
				choice = 0;
				System.out.println("please input the annual rate");
				annualRate = IO.readDouble();
				System.out.println("please select one of the following compounding options:");
				System.out.println("(1) daily");
				System.out.println("(2) monthly");
				System.out.println("(3) annually");
				do{
					choice = IO.readInt();
				}while(choice > 3 || choice < 1);
				Finance.computeApy(annualRate,choice);
			}
			if(choice == 2){
				choice = 0;
				System.out.println("please select one of the following payment options:");
				System.out.println("(1) biweekly");
				System.out.println("(2) monthly");
				System.out.println("(3) quarterly");
				do{
					choice = IO.readInt();
				}while(choice > 3 || choice < 1);
				System.out.println("please input the annual rate");
				annualRate = IO.readDouble();
				System.out.println("please input the number of years this will be paid over");
				do{
					years = IO.readInt();
				}while(years < 1);
				System.out.println("please input the principal value of the loan");
				principal = IO.readDouble();
				Finance.computeLoanPayment(principal, annualRate, years, choice);
			}
			if(choice == 3){
				loop = false;
			}
		}while(loop == true);
	}
}
