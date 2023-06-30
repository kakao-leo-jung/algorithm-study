package algorithm.study.dohyun.algorithm;
import java.util.*;

// 선택정렬 : 배열에서 최대값을 골라서 배열의 맨 마지막으로 보낸 후 마지막 인덱스를 없애는 것을 반복하는 것.

public class selectionsort {
	public static void swap(int[] arr, int i , int j) {
		int tmp = arr[i];
		arr[i]= arr[j];
		arr[j] = tmp;
		
	}
	public static void selectionSort(int[] arr, int n) {
		
		if(n<2)
			return;
		
		else {
			int max = arr[0];
			int maxindex = 0;
			for(int i =1;i<n;i++) {
				if(arr[i]>max) {
					max = arr[i];
					maxindex=i;
				}
			}
			swap(arr,maxindex,n-1);	
		}
		
		selectionSort(arr,n-1);
	}
	
	public static void main(String[] args) {
		int[] sort = {29,10,14,37,13};
		
		selectionSort(sort,5);
		System.out.println(Arrays.toString(sort));
	}
}
