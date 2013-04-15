public class VendingMachine{
	private int numslots;
	private String product;
	private int maxperslot;
	private double cash;
	private int[] stock;
	private double[] price;
	String[] machine;

	public VendingMachine(int numslots, int maxperslot, double cash){
		this.numslots = numslots;
		this.maxperslot = maxperslot;
		this.cash = cash;
		machine = new String[numslots];
		stock = new int[numslots];
		price = new double[numslots];
	}

	public void setProduct(int slot, String product, double price){
		if(slot >= 0 && slot < this.numslots){
			machine[slot] = product;
			this.price[slot] = price;
		}else{
			System.out.println("Slot selection must be between values 0 and "+stock);
		}
	}

	public void restockProduct(String product, int quantity){
		for(int i = 0; i < numslots; i++){
			if(machine[i].equalsIgnoreCase(product)){
				stock[i] = stock[i] + quantity;
				quantity = stock[i] - maxperslot;
				stock[i] = Math.min(maxperslot, stock[i]);
			}
		}
	}

	public double getCashOnHand(){
		return cash;
	}

	public int getQuantity(int slot){
		if (slot >= 0 && slot < numslots){
			return stock[slot];
		}
		return 0;
	}

	public int getQuantity(String product){
		int total = 0;
		for(int i = 0; i < numslots; i++){
			if(machine[i]!=null && machine[i].equalsIgnoreCase(product)){
				total += stock[i];
			}
		}
		return total;
	}

	public boolean buyItem(int slot){
		if(slot >= 0 && slot<numslots){
			if(stock[slot] > 0){
				cash += price[slot];
				stock[slot] = stock[slot]--;
				return true;
			}
		}
		return false;
	}
}
