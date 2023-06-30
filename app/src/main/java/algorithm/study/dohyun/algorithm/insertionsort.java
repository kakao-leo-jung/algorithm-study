package algorithm.study.dohyun.algorithm;

public class insertionsort {
//insertion sort 삽입 정렬 : 두번째 원소부터 앞 원소랑 비교해서 더크면 가만히 작으면 앞으로 삽입
	
	

	
	public static void insertionSort(int[] arr, int num) {
		
		for(int i=1;i<num;i++) {
			int tmp = arr[i]; // 넣으려고 하는 
			int j =i-1;
			while(j>=0 && tmp <arr[j]) { //들어가려는 새 원소의 값이 다른 값보다 작을
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = tmp;
			
		}

		
		
	}
	
	public static void main(String[] args) {
		int[] arr= {15,12,13,10,14,11};
		insertionSort(arr,arr.length);
		
		for(int i:arr)
			System.out.print(i+" ");
	}

}
