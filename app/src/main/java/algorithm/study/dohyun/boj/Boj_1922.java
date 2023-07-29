package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
public class Boj_1922 {
    static int[][] arr;
    static int[] p;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        int m = Integer.parseInt(br.readLine()); // 연결할 수 있는 선의 수

        arr = new int[m][3];
        p = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            p[i] = i;
        }
        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(arr, (o1, o2) -> o1[2] - o2[2]);

        int ans =0;
        for(int[] i: arr){
            if( merge(i[0], i[1]) ){
                ans += i[2];
            }
        }


        System.out.println(ans);
        br.close();
    }

    public static int findset(int x) {
        if (x == p[x])
            return x;
        return p[x] = findset(p[x]);
    }

    public static boolean merge(int x, int y) {
        x = findset(x);
        y = findset(y);
        if(x!= y) {
            p[y] = x;
            return true;
        }
        return false;
    }
}