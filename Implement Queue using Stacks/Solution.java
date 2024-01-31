class MyQueue {
    private Stack<Integer> s1;
        private Stack<Integer> s2;

    public MyQueue() {
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
        
    }
    
    public void push(int x) {
        while(!s1.empty())
              s2.push(s1.pop());

              s1.push(x);

              while(!s2.empty())
              s1.push(s2.pop());
    }
    
    public int pop() {
        int temp = s1.peek();
        s1.pop();
        return temp;
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.empty();
    }
}
