public class BinarySearch{
	int[] nums = {1,3,6,9,5,7,4,2,6,8,0};

	public int binarySearch(int check){
		int hi = nums.length - 1;
		int lo = 0;
		int guess;
		while(hi >= lo){
			guess = lo + ((hi - lo) / 2);
			if(nums[guess] > check){
				hi = guess - 1;
			}else if(nums[guess] < check){
				lo = guess + 1;
			}else{
				return guess;
			}
		}
		return -1;
	}

	public void sortArray(){
		for (int currentPlace = 0; currentPlace < nums.length-1; currentPlace++){
			int smallest = Integer.MAX_VALUE;
			int smallestAt = currentPlace + 1;
			for (int check = currentPlace; check < nums.length; check++){
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
		BinarySearch test = new BinarySearch();
		int q = (int)(Math.random() * 10);
		test.sortArray();
		int p = test.binarySearch(q);
		System.out.println("The selected number is "+p);
	}
}
