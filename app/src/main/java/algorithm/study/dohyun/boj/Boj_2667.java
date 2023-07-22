package algorithm.study.dohyun.boj;
import java.io.*;
import java.util.*;

public class Boj_2667 {
    static int n;
    static int num=0;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for(int j=0; j<n;j++)
                arr[i][j] = str.charAt(j)-'0';

        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j] && arr[i][j] == 1){
                    num = 1;
                    dfs(i,j);
                    list.add(dfs(i,j));
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int i : list)
            System.out.println(i);

    }
    public static int dfs(int x, int y){
        visited[x][y] =true;
        for(int i=0;i<4; i++){
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(0 <= nx && 0 <= ny && nx < n && ny < n){
                if(!visited[nx][ny] && arr[nx][ny] ==1){
                    dfs(nx,ny);
                    num++;
                }
            }
        }
        return num;
    }
}