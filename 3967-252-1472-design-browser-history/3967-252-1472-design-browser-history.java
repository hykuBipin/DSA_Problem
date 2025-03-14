class BrowserHistory {
    Stack<String> history;
    Stack<String> future;

    public BrowserHistory(String homepage) {
        history = new Stack<>();
        future = new Stack<>();
        history.push(homepage);
    }
    
    public void visit(String url) {
        history.push(url);
        future.clear();
    }
    
    public String back(int steps) {
        while(history.size()> 1 && steps > 0)
        {
            future.push(history.pop());
            steps--;
        }
        return  history.peek();
    }
    
    public String forward(int steps) {
        while(future.size()>0 && steps > 0)
        {
        history.push(future.pop());
        steps--;
        }
        return history.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */