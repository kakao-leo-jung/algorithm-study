package algorithm.study.dohyun.algorithm;

public class bubblesort {
	//bubble sort = 배열의 첫번째 값을 다음 값과 비교해서 더 크면 자리 바꾸기 x N
	
	public static int[] exchange(int[] arr, int i, int j) {
		
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		
		return arr;
	}
	
	
	public static void bubbleSort(int[] arr, int num) {
		
		
		for(int i=0;i<num-1;i++) {
				if(arr[i] > arr[i+1])
					exchange(arr,i,i+1);
			}
		if(num<1)
			return;
		
		bubbleSort(arr,num-1);
		
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {29,10,14,37,13};
		bubbleSort(arr,arr.length);
		
		for(int i : arr)
			System.out.print(i+" ");

	}

}
