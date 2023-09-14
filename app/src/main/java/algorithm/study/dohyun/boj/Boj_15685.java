package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
public class Boj_15685 {
    static boolean[][] table = new boolean[101][101];
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,-1,0,1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i =0 ; i< n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());

            dragoncurve(x,y,d,g);
        }
        int ans = 0;
        for(int i=0; i < 100; i++){
            for(int j = 0; j<100; j++){
                if (table[i][j] && table[i][j + 1] && table[i + 1][j] && table[i + 1][j + 1])
                    ans++;
            }
        }
        System.out.println(ans);
    }
    public static void dragoncurve(int x, int y, int d , int g){

        table[y][x] = true;
        ArrayList<Integer> list = new ArrayList<>(); // 방향을 담아두는 리스트
        list.add(d); // 첫번째 방향

        for(int i=0; i<g; i++){
            for(int j = list.size()-1 ; j>=0; j--){
                int nextd = (list.get(j) + 1) % 4;
                list.add(nextd);
            }
        }
        for(int dir : list){
            x = x + dx[dir];
            y = y + dy[dir];
            table[y][x] = true;
        }
    }
}
