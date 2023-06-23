package algorithm.study.dohyun.algorithm;

import java.util.Arrays;

public class mergesort {
	
	public static void mergeSort(int arr[], int first, int end) {
		
		
		if(first<end) {
			int mid = (first+end)/2;
			mergeSort(arr,first,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,first,mid,end);
		}
		
	}
	
	public static void merge(int arr[],int first,int mid,int end) {
		
		int[] result = new int[arr.length];
		int p = first , q =mid+1, r = first;
		while(p<=mid && q<=end ) {
			if(arr[p]<=arr[q])
				result[r++] = arr[p++];
			else
				result[r++] = arr[q++];
			
		}
		while(p<=mid)
			result[r++] = arr[p++];
		while(q<=end)
			result[r++] = arr[q++];
		for(int i = first; i<=end;i++){
			arr[i] = result[i];
		}
		
		
	}

	public static void main(String[] args) {
		
		int[] arr = {5,2,4,7,1,3,8,6};
		mergeSort(arr,0,(arr.length)-1);
		System.out.println(Arrays.toString(arr));


	}

}