package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
public class Boj_14502 {
    static int n,m;
    static int[][] map;

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int safezone = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];


        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<m;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        wall(0);
        System.out.println(safezone);

    }
    public static void wall(int wallnum){

        // 벽을 3개 세웠으면 바이러스 뿌리고 세이프존 개수 구하기
        if( wallnum == 3){
            virus();
            return;
        }

        for( int i =0; i< n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j] == 0){

                    map[i][j] = 1;
                    wall(wallnum+1);
                    map[i][j] = 0;

                }
            }
        }
    }
    public static void virus() {

        Queue<int[]> q = new LinkedList<>();

        int[][] tmpmap = new int[n][m];
        // 새로운 map에 받아온 wall을 기준으로 바이러스 뿌리고 개수구하기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tmpmap[i][j] = map[i][j];
                if (map[i][j] == 2)
                    q.add(new int[]{i, j});
            }
        }

        while (!q.isEmpty()) {

            int[] now = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {

                    if (tmpmap[nx][ny] == 0) {
                        q.add(new int[] {nx,ny});
                        tmpmap[nx][ny] = 2;
                    }
                }
            }
        }
        safezonenum(tmpmap);
    }
    public static void safezonenum(int[][] tmpmap ){

        int nownum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                if(tmpmap[i][j] == 0)
                    nownum++;
            }
        }
        if(nownum>safezone)
            safezone = nownum;

    }

}