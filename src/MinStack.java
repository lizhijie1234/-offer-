import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> min = new Stack<>();

    public void push(int node) {
        if(stack.isEmpty()){
            stack.push(node);
            min.push(node);
        }
        int temp = min.peek();
        stack.push(node);
        if(node < temp){
            min.push(node);
        }else{
            min.push(temp);
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.pop();
    }

    public int min() {
        return min.peek();
    }
}
