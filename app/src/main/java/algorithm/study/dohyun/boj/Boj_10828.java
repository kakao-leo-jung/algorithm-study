package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;


class Stack{
	int top;
	int stackArr[];
	
	public Stack(int size) {
		this.top = -1;
		this.stackArr = new int[size];
	}
	public void push(int x) {
		top++;
		this.stackArr[top] = x;
		
	}
	public int pop(){
		if(top == -1)
			return -1;
		return this.stackArr[top--];
	}
	public int size() {
		return top+1;
	}
	public int empty() {
		if(top == -1 )	return 1;
		return 0;
	}
	public int top() {
		if(top == -1 ) return -1;
		return stackArr[top];
	}
	
}



public class Boj_10828 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		
		
	}
	
}