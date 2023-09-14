/*
 * package algorithm.study.dohyun.programmers; import java.util.*; public class
 * Prg_120852 {
 * 
 * public static int[] main(String[] args) { List<Integer> tmp = new
 * ArrayList<>();
 * 
 * for(int i=2;i<=n; i++) { while(n%i == 0) { tmp.add(i); n/=i; } } int[] answer
 * = tmp.stream().distinct().mapToInt(i->i).toArray(); return answer; } }
 */