public class SelectionSort{
	int[] nums = {5,4,3,2,1};
	
	public void printArray(){
		for(int i = 0; i < nums.length; i++){
			if(i == 4){
				System.out.print(nums[i]);
			}
			System.out.print(nums[i]+", ");
		}
	}
	
	public void sortArray(){
		for (int currentPlace = 0; currentPlace < nums.length-1; currentPlace++){
			int smallest = Integer.MAX_VALUE;
			int smallestAt = currentPlace+1;
			for(int check = currentPlace; check < nums.length; check++){
				if(nums[check] < smallest){
					smallestAt = check;
					smallest = nums[check];
				}
			}
			int temp = nums[currentPlace];
			nums[currentPlace] = nums[smallestAt];
			nums[smallestAt] = temp;
		}
	}

	public static void main(String args[]){
		SelectionSort test = new SelectionSort();
		test.printArray();
		test.sortArray();
		test.printArray();
	}
}
