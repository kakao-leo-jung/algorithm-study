package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_42583 {
    public static void main(String[] args){
        Prg_42583 sol = new Prg_42583();
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        int ans = sol.solution(bridge_length,weight,truck_weights);
        System.out.println(ans);

        int bridge_length2 = 100;
        int weight2 = 100;
        int[] truck_weights2 = {10};
        int ans2 = sol.solution(bridge_length2,weight2,truck_weights2);
        System.out.println(ans2);

        int bridge_length3 = 100;
        int weight3 = 100;
        int[] truck_weights3 = {10,10,10,10,10,10,10,10,10,10};
        int ans3 = sol.solution(bridge_length3,weight3,truck_weights3);
        System.out.println(ans3);
    }

    public int solution(int bridge_length, int weight, int[] truck_weights){
        int ans = 0;
        int sum = 0;
        Queue<Integer> q = new LinkedList<>(); // 대기중인 트럭



        for( int i=0; i<truck_weights.length ; i++ ){
            int tmp = truck_weights[i];

            while( true ){
                    if( q.isEmpty() ){
                        q.add(tmp); // 7
                        sum += tmp; // 7
                        ans++;
                        break;
                     }else if( q.size() == bridge_length ){
                        sum = sum - q.poll(); // sum = 1 q = 0
                    }else{
                        if( sum + tmp <= weight ){
                            q.add(tmp); //q = 0 5
                            sum = sum + tmp; // 6
                            ans++; //3
                            break;
                        }
                        else{
                            q.add(0); // q = 7 0
                            ans++; // 2

                        }
                    }
            }

        }
        return ans + bridge_length;
    }
}



