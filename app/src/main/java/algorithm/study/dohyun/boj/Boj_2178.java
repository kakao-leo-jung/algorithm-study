package algorithm.study.dohyun.boj;
import java.io.*;
import java.util.*;

public class Boj_2178 {
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int n;
    static int m;
    static int[][] arr;
    static boolean[][] visited;
    private static class Node{
        int x;
        int y;
        Node(int x,int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0; i<n; i++){
            String line = br.readLine();
            for(int j =0;j<m; j++){
                arr[i][j] = line.charAt(j)-48;
            }
        }
        miro(0,0);
        System.out.println(arr[n-1][m-1]);
    }
    public static void miro(int x, int y){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x,y));
        visited[x][y] = true;

        while(!q.isEmpty()){
            Node now = q.poll();
            for(int i=0; i<4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(nx<0 || ny< 0|| n<=nx || m<=ny)
                    continue;
                if(visited[nx][ny] || arr[nx][ny] ==0)
                    continue;
                q.add(new Node(nx,ny));
                arr[nx][ny] = arr[now.x][now.y] +1;
                visited[nx][ny] = true;
            }

        }
    }

}
