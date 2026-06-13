class MinStack {
private Stack<Integer> stack;
private Stack<Integer> stackMin;

    public MinStack() {
        stack = new Stack<>();
        stackMin = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(stackMin.isEmpty() || stackMin.peek() >= val){
            stackMin.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int val = stack.pop();
        if(stackMin.peek() == val){
            stackMin.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stackMin.peek();
    }
}
