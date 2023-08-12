package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_67256 {

    public static void main(String[] args){

        Prg_67256 sol = new Prg_67256();
        int[] numbers1= {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand1 = "right";
        String ans = sol.solution(numbers1, hand1);
        System.out.println(ans);

        int[] numbers2= {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand2 = "left";
        String ans2 = sol.solution(numbers2, hand2);
        System.out.println(ans2);
    }
    private static final int[][] keypad = {{1,2,3},{4,5,6},{7,8,9},{-2,0,-1}};

    public static String solution(int[] numbers, String hand){
        StringBuilder sb = new StringBuilder();
        int leftloca = -2;
        int rightloca = -1;
        for(int i=0; i<numbers.length;i++ ){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                sb.append('L');
                leftloca = numbers[i];
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                sb.append('R');
                rightloca = numbers[i];
            }
            else{ // 2 5 8 0 일 때
                int[] left = location(leftloca);
                int[] right = location(rightloca);
                int[] now = location(numbers[i]);

                int llen = Math.abs(left[0]-now[0]) + Math.abs(left[1]-now[1]);
                int rlen = Math.abs(right[0]-now[0]) + Math.abs(right[1]-now[1]);

                if(llen>rlen) { // left가 더 긴거야
                    sb.append('R');
                    rightloca = numbers[i];

                }else if( llen < rlen){
                    sb.append('L');
                    leftloca = numbers[i];

                }else{ // a== b

                    if(hand.equals("left")){
                        sb.append('L');
                        leftloca = numbers[i];

                    }
                    else{
                        sb.append('R');
                        rightloca = numbers[i]; }
                }
            }
        }
        return sb.toString();

    }
    public static int[] location(int ithnum){
        int[] arr = new int[2];
        for(int i = 0;i<4; i++){
            for(int j =0;j<3; j++){
                if(keypad[i][j] == ithnum){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}

