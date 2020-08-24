import java.util.*; 
  
public class Main  
{ 
    
    static int ePostfix(String exp) 
    { 
        
        Stack<Integer> stack=new Stack<>(); 
          
        
        for(int i=0;i<exp.length();i++) 
        { 
            char c=exp.charAt(i); 
              
          
            if(Character.isDigit(c)) 
            stack.push(c - '0'); 
              
            
            else
            { 
                int val1 = stack.pop(); 
                int val2 = stack.pop(); 
                  
                switch(c) 
                { 
                    case '+': 
                    stack.push(val2+val1); 
                    break; 
                      
                    case '-': 
                    stack.push(val2- val1); 
                    break; 
                      
                    case '/': 
                    stack.push(val2/val1); 
                    break; 
                      
                    case '*': 
                    stack.push(val2*val1); 
                    break; 
              } 
            } 
        } 
        return stack.pop();     
    } 
      
    
    public static void main(String[] args)  
    { 
       Scanner s1=new Scanner(System.in);
		String ch=new String();
		ch=s1.nextLine();
		System.out.println(ePostfix(ch));
    } 
} 
