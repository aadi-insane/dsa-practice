import java.util.*;

class LeftRotate{
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = 4;
		rotate(arr, n);
		System.out.println(Arrays.toString(arr));
	}
	static void rotate(int[] arr, int n){
		reverse(arr, 0, n-1);
		reverse(arr, n, arr.length-1);
		reverse(arr, 0, arr.length-1);
	}

	static void reverse(int[] arr, int start, int end){

		while(start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
