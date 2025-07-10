import java.util.*;

class MoveZeroToEnd{
	public static void main(String[] args){
		int[] arr = {0, 0, 1, 5, 0, 5, 2, 0, 0, 10, 0, 7, 8};
		int count = 0;
	        int[] newArr = new int[arr.length];
		for(int i = 0; i<arr.length; i++){
				if(arr[i] != 0){
					newArr[count] = arr[i];
					count ++;
				}
		}
		while(count<arr.length){

			newArr[count] = 0;
			count++;
		}
		//System.out.println();
		//System.out.println(Arrays.toString(arr));
		//System.out.printf("Count = %d, Arrays Size = %d", count, arr.length);
		System.out.println(Arrays.toString(newArr));
	}

}
