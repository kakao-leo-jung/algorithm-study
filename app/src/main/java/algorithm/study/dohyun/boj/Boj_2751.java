package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;

public class Boj_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++)
            arr.add(Integer.parseInt(br.readLine()));

        Collections.sort(arr);

        for(int i: arr)
            sb.append(i).append('\n');

        System.out.println(sb);
    }
}
