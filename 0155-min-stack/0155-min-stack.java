class MinStack {
      private Stack<Integer> stack;
      private Stack<Integer> Mn;
    public MinStack() {
        stack=new Stack<>();
        Mn=new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(Mn.isEmpty()||val<=Mn.peek()){
            Mn.push(val);
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            int popped=stack.pop();
            if(popped==Mn.peek()){
                Mn.pop();
            }
        }
        
    }
    
    public int top() {
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek();
        
    }
    
    public int getMin() {
        if(Mn.isEmpty()){
            return -1;
        }
        return Mn.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */