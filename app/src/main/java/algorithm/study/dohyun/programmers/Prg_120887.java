package algorithm.study.dohyun.programmers;


public class Prg_120887 {
	public static void main(String[] args) {
		Prg_120887 sol = new Prg_120887();
		int i =1;
		int j = 13;
		int k =1;
		int ans1 = sol.solution(i,j,k);
		System.out.println(ans1);
		
		int a =10;
		int b = 50;
		int c =5;
		int ans2 = sol.solution(a,b,c);
		System.out.println(ans2);

	}
    public int solution(int i, int j, int k) {
        int answer = 0;
       
        for(int a=i; a<=j ; a++){
            
            String str = Integer.toString(a);
            int len = str.length();
            
            for(int b = 0; b < len; b++){
                if(str.charAt(b) == (char)(k+'0') )
                    answer++;
            }
        }
        return answer;
    }
}


