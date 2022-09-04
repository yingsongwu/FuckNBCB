import java.util.ArrayList;
import java.util.Stack;

public class StackPopPush {
    public static void main(String[] args) {
        int [] pushA = {2,1,0};
        int [] popA = {1,2,0};
        System.out.println(IsPopOrder(pushA,popA));
    }

    public static boolean IsPopOrder(int [] pushA,int [] popA) {

        //statck模拟入栈
        Stack<Integer> stack = new Stack();

        //i入栈标记位，j出栈标记位
        for (int i = 0,j = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);

            while ( j < pushA.length && !stack.isEmpty() && stack.peek() == popA[j] ){
                stack.pop();
                j++;
            }
        }

        return stack.isEmpty();
    }
}