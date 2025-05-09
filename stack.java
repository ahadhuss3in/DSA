import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Stack;


public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(6);
        stack.push(8);

     for(int num:stack){
            System.out.println(num);
        }

    }
}
