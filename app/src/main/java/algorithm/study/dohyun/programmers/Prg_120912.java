package algorithm.study.dohyun.programmers;


public class Prg_120912 {

	public static void main(String[] args) {
		Prg_120912 sol= new Prg_120912();
		int[] arr1 = {7,77,17};
		int ans1 = sol.solution(arr1);
		System.out.println(ans1);
		
		int[] arr2 = {10,29};
		int ans2 = sol.solution(arr2);
		System.out.println(ans2);
	}
	public int solution(int[] array) {
        int answer = 0;
        
        for(int i=0;i<array.length;i++){
            int tmp = array[i];
            while(tmp > 0){
                if(tmp %10 == 7)
                    answer++;
                tmp /= 10;
            }
        }
        
        return answer;
   
	}
}