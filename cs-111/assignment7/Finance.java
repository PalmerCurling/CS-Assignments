public class Finance
{
	public static double computeApy(double annualRate, int compoundingOption){
		double n = 0;
		if(compoundingOption > 3 || compoundingOption < 1 || annualRate < 0){
			return(-1);
		}
		if(compoundingOption == 1){
			n = 365;
		}
		if(compoundingOption == 2){
			n = 12;
		}
		if(compoundingOption == 3){
			n = 1;
		}
		annualRate = annualRate/100;
		double apy = (annualRate/n);
		apy = 1 + apy;
		apy = Math.pow(apy,n);
		apy = apy-1;
		apy = apy * 100;
		int temp = (int) (apy*100);
		apy = ((double)temp)/100;
		System.out.println(apy);
		return(apy);
	}

	public static double computeLoanPayment( double principal, double annualRate, double yearsDuration, int paymentOption){
		annualRate = annualRate/100;
		double n = 0;
		if(paymentOption > 3 || paymentOption < 1 || principal <= 0 || annualRate <= 0 || yearsDuration <= 0 ){
			return(-1);
		}else{
			if(paymentOption == 1){
				n = 26*yearsDuration;
				annualRate = annualRate/26;
			}
			if(paymentOption == 2){
				n = 12*yearsDuration;
				annualRate = annualRate/12;
			}
			if(paymentOption == 3){
				n = 4*yearsDuration;
			}
			double x = Math.pow((1+annualRate),n);
			double a = ((annualRate*x)/(x-1))*principal;
			int temp = (int) (a*100);
			a = ((double)temp)/100;
			System.out.println(a);
			return(a);
		}
	}
}
