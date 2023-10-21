package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
public class Boj_14503 {
    static int n,m;
    static int[][] room;
    static int ans;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        room = new int[n][m];
        st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for(int i=0; i< n;i++ ){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<m;j++){
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        ans = 1;
        dfs(r,c,d);

        System.out.println(ans);
    }
    public static void dfs(int r, int c ,int d){
        // (r,c) = 지금 위치
        // d = 바라보고 있는 방향
        room[r][c] = 2; // 2 = 청소완료

        for(int i=0; i< 4; i++){

            d = (d+3)%4; // 반시계방향으로 90도 회전
            int nx = r + dx[d];
            int ny = c + dy[d];

            if( 0<= nx && 0<= ny && nx< n && ny <m  &&room[nx][ny] == 0){
                    ans++;
                    dfs(nx,ny,d);
                    return;
            }
        }

        int back = ( d + 2 )%4;
        int bx = r + dx[back];
        int by = c + dy[back];
        if( 0<= bx && 0<= by && bx< n && by<m && room[bx][by] != 1)
            dfs(bx,by,d);


    }
}