class CustomStack {
    int[] stk;
    int capacity;
    int tos;
    
    public CustomStack(int maxSize) {
        stk = new int[maxSize];
        capacity = maxSize;
        tos = -1; // top of stack initialized to -1 indicating empty stack
    }
    
    public void push(int x) {
        if (tos < capacity - 1) { // Only push if stack isn't full
            tos++;
            stk[tos] = x;
        }
    }
    
    public int pop() {
        if (tos == -1) { // Check if stack is empty
            return -1;
        }
        int poppedElement = stk[tos];
        tos--;
        return poppedElement;
    }
    
    public void increment(int k, int val) {
        // Increment the bottom k elements, or all if k is larger than the current stack size
        int limit = Math.min(k, tos + 1); // The limit is the smaller of k or the stack size
        for (int i = 0; i < limit; i++) {
            stk[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */