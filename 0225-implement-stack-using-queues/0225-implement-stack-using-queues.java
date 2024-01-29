class MyStack {
    int[] stack = new int[100];
    int tos;

    public MyStack() {
        tos = -1;
        
    }
    
    public void push(int x) {
        tos++;
        stack[tos] = x;
        
        
    }
    
    public int pop() {
       if(tos==-1){
           return 0;
       }
        else{
            int y = stack[tos];
            tos--;
            return y;
            
        }
            
    }
    
    public int top() {
         if(tos==-1)
            return 0;
        else
            return stack[tos];
        
        
    }
    
    public boolean empty() {
        if(tos==-1)
            return true;
        else
            return false;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */