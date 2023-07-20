package algorithm.study.dohyun.algorithm;

import java.util.Arrays;

public class quicksort {

	public static void quickSort(int[] arr, int num) {
		
		int pivot = arr[num]; //15
		
		partition(arr,pivot);
		
	}
	public static void partition(int[] arr, int pivot) {
		//pivot = 15;
		
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {31,8,48,73,11,3,20,29,65,15};
		quickSort(arr,arr.length-1);
		
		System.out.println(Arrays.toString(arr));

	}

}
