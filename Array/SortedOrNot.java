class SortedOrNot{
	public static void main(String[] args){

	        int[] arr = {2, 5, 7, 56, 4, 7, 8, 96, 354, 56};
		boolean sorted = true;

		for (int i = 0; i<arr.length-1; i++){
			if(arr[i+1]<arr[i]){
				sorted = false;
				break;
			}
		}
		if(sorted){
			System.out.println("Given Array is Sorted.");
		}
		else{
			System.out.println("Given Array is not sorted.");
		}
	}

}
