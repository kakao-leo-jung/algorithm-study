package algorithm.study.dohyun.boj;
import java.io.*;
import java.util.*;

public class Boj_2606 {
    static int comnum,connect;
    static int[][] list ;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        comnum = Integer.parseInt(br.readLine());
        connect = Integer.parseInt(br.readLine());

        list = new int[comnum+1][comnum+1];
        visited = new boolean[comnum + 1];

        for(int i=0; i<connect; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a][b] =1;
            list[b][a] =1;
        }

        int f  = 1;
        virus(f);
    }
    public static void virus(int f){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(f);
        visited[f] = true;
        int ans = 0;

        while(!q.isEmpty()){
            f = q.poll();

            for(int i=1;i<=comnum; i++){
                if(!visited[i] && list[f][i] == 1) {
                    q.add(i);
                    visited[i] = true;
                    ans++;

                }
            }
        }
        System.out.println(ans);
    }
}
