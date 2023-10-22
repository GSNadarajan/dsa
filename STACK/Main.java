package day1;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        // STACK
        // LAST IN FIRST OUT DATASTRUCTURES
        // STORES OBJECT IN A VERTICAL ORDER (eg: books in a shelf)
        // PUSH() to add to the top
        // Pop() to remove from the top

        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());

        stack.push("book1");
        stack.push("book2");
        stack.push("book3");  //To add a new element into the stack

        System.out.println(stack.empty()); //To check whether the stack is empty or not

        System.out.println(stack);

        stack.pop(); //To remove the top element 

        System.out.println(stack.peek()); //To get the top element 
        System.out.println(stack.search("book2")); //To search the particular item from the stack

        for(int i=0; i < 100000000; i++){
            stack.push("book4");      // It throws heap space we can't do like this in stack

        }
        System.out.println(stack);


        //uses of stack ?
        //1. undo /redo features in text editor
        //2. moving back/fro in browser history
        //3.backtracking
        

    }
}