package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
public class Boj_1012 {
    static int num =0;
    static int[][] arr;
    static int m,n,k;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); //test 케이스

        for(int r =0;r<t ;r++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); // 가로길이
            n = Integer.parseInt(st.nextToken()); // 세로길이
            k = Integer.parseInt(st.nextToken()); // 배추가 심어진 위치

            arr = new int[m][n];
            visited = new boolean[m][n];

            for(int i=0; i<k; i++){
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a][b] = 1;
            }
            for(int i=0;i<m;i++){
                for(int j = 0;j<n;j++){
                    if(!visited[i][j] && arr[i][j] == 1){
                        dfs(i,j);
                        num++;
                    }
                }
            }

            System.out.println(num);
            num = 0;
        }

    }
    public static void dfs(int x,int y){
        visited[x][y] = true;

        for(int i=0; i< 4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && ny >= 0 && nx < m && ny < n){
                if ( !visited[nx][ny] && arr[nx][ny] ==1){
                    dfs(nx,ny);
                }
            }
        }

    }
}
