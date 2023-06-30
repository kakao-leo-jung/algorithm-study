package algorithm.study.dohyun.algorithm;

import java.util.Arrays;

// 분할정복법 ㅣ 풀고자하는 문제를 작은 크기의 동일한 문제로 분할하고 작은 문제들을 순환적으로 해결 후에 작은 문제의 해를 merge합하기.

public class mergesort {
	

	public static void mergeSort(int[] arr, int first, int last) {
	
		if(first<last) {
			int mid = (first+last)/2 ;
			mergeSort(arr,first,mid);
			mergeSort(arr,mid+1,last);
			merge(arr,first,mid,last);
			
		}
	}
	
	
	public static void merge(int[] arr, int first, int mid, int last) {
		
		int[] newarr = new int[arr.length];
		int pointer = first;
		int p = first;
		int q = mid+1;			
			
		while(p<=mid && q <= last) {
			if(arr[p]<=arr[q])
				newarr[pointer++] = arr[p++];
			else
				newarr[pointer++] = arr[q++];
		}
		while(p<=mid) 
			newarr[pointer++] = arr[p++];
		while(q<=last)
			newarr[pointer++] = arr[q++];
		
		for(int i=first;i<=last;i++) {
			arr[i] = newarr[i];
		}
			
		}
		
	public static void main(String[] args) {
	
		int[] arr= {5,2,4,7,1,3,8,6};
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
			
	}
}
