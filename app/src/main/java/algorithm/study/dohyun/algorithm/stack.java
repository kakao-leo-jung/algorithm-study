package algorithm.study.dohyun.algorithm;
import java.util.*;
public class stack {
    int size; //stack용량
    int top;
    char[] stack;
    public stack(int size){
       top = -1;
       this.size = size;
       stack= new char[this.size];
    }

    public boolean isEmpty(){
        return (top == -1 );
    }
    public boolean isFull(){
        return (top==this.size-1);
    }
    public void push(char item){
        if(isFull())    System.out.println("Stack is Full!!!");
        else{
            stack[++top] = item;
            System.out.println(stack[top] + " Push!!");
        }
    }
    public char pop() {
        if (isEmpty()) System.out.println("Stack is empty!!!!");

        System.out.println(stack[top] + " Pop!!!");
        return stack[--top];
    }
    public char peek(){
        if(isEmpty()) {
            System.out.println("Stack is Empty!");
            return 0;
        }
        System.out.println("Peeking Item: "+ stack[top]);
        return stack[top];
    }
    public int size(){
        return top;
    }
    public void printstack(){
        if(isEmpty())  System.out.println("Stack is empty~ ");
        else{
            System.out.print("Stack : ");
            for(int i=0;i<=top;i++)
                System.out.print(stack[i]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args){
        int stackSize = 5;
        stack arrStack = new stack(stackSize);

        arrStack.push('A');
        arrStack.printstack();
        arrStack.push('B');
        arrStack.printstack();
        arrStack.push('C');
        arrStack.printstack();
        arrStack.size();
        arrStack.pop();
        arrStack.printstack();
        arrStack.pop();
        arrStack.printstack();
        arrStack.peek();
        arrStack.printstack();


    }
}
