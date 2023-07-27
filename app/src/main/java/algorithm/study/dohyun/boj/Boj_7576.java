package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;

public class Boj_7576 {
    private static class node {
        int x, y;

        node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int m,n;
    static boolean[][] visited;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }

        }

        bfs();

    }
    public static void bfs(){
        Queue<node> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(arr[i][j] == 1){ // 토마토가 익은 1 의 주변을 봐야하니까 1
                    q.add(new node(i,j));
                }
            }
        }

        while(! q.isEmpty() ){
            node no = q.poll();
            for(int i=0; i<4; i++){
                int nx = no.x + dx[i];
                int ny = no.y + dy[i];

                if(nx < 0 || ny <0 || n <= nx || m <= ny)   continue;
                if(arr[nx][ny] == 0){
                    arr[nx][ny] = arr[no.x][no.y] + 1;
                    q.add(new node(nx,ny));
                }
            }

        }
        int max = 0;
        for(int i=0;i< n; i++){
            for(int j = 0; j< m ; j++){
                if(arr[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max,arr[i][j]);
            }
        }
        System.out.println(max-1);
    }

}

