class BrowserHistory {
public:
stack<string>b,f;
    BrowserHistory(string homepage) {
        b.push(homepage);
    }
    
    void visit(string url) {
        b.push(url);
         while(!f.empty()){
            f.pop();
        }
    }
    
    string back(int steps) {
        while(b.size()> 1 && steps--){
            f.push(b.top());
            b.pop();
        }
        return b.top();
       
    }
    
    string forward(int steps) {
        while(!f.empty() && steps--){
           b.push(f.top());
           f.pop();
        }
        return b.top();

        
    }
};

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory* obj = new BrowserHistory(homepage);
 * obj->visit(url);
 * string param_2 = obj->back(steps);
 * string param_3 = obj->forward(steps);
 */