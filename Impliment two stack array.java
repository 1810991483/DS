
class Main 
{ 
    int size; 
    int t1, t2; 
    int a[]; 
  
    Main(int n) 
    { 
        a = new int[n]; 
        size = n; 
        t1 = -1; 
        t2 = size; 
    } 
  
    
    void push1(int x) 
    { 
        
        if (t1 < t2 - 1) { 
            t1++; 
            a[t1] = x; 
        } 
        else { 
            System.out.println("Stack Overflow"); 
            System.exit(1); 
        } 
    } 
  
    void push2(int x) 
    { 
        
        if (t1 < t2 - 1) { 
            t2--; 
            a[top2] = x; 
        } 
        else { 
            System.out.println("Stack Overflow"); 
            System.exit(1); 
        } 
    } 
  
    
    int pop1() 
    { 
        if (t1 >= 0) { 
            int x = a[t1]; 
            t1--; 
            return x; 
        } 
        else { 
            System.out.println("Stack Underflow"); 
            System.exit(1); 
        } 
        return 0; 
    } 
  
    
    int pop2() 
    { 
        if (t2 < size) { 
            int x = a[t2]; 
            t2++; 
            return x; 
        } 
        else { 
            System.out.println("stack underflow"); 
            System.exit(1); 
        } 
        return 0; 
    } 
  
    
    public static void main(String args[]) 
    { 
        Main ts = new Main(5); 
        ts.push1(5); 
        ts.push2(10); 
        ts.push2(15); 
        ts.push1(11); 
        ts.push2(7); 
        System.out.println("Popped element from"
                           + " stack1 is " + ts.pop1()); 
        ts.push2(40); 
        System.out.println("Popped element from"
                           + " stack2 is " + ts.pop2()); 
    } 
} 
