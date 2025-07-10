class SecondLargest{
	public static void main(String[] args){

	int[] arr = {2, 5, 7, 56, 4, 7, 8, 96, 354, 56};

	int largest = Integer.MIN_VALUE;
	int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
                if(arr[i]>largest){
                        secondLargest = largest;
                        largest = arr[i];
		}
                else if (arr[i]>secondLargest && arr[i] != largest){
                        secondLargest = arr[i];
                }
        }


	System.out.println(largest + " in the largest number in the given Array.");
	System.out.println(secondLargest + " in the second largest number in the given Array.");
	}

}
