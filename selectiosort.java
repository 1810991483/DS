import java.util.*;
class Main
{
    void sort(int a[])
    {
        int n = a.length;
 
        
        for (int i = 0; i < n-1; i++)
        {
            
            int min = i;
            for (int j = i+1; j < n; j++)
                if (a[j] < a[min])
                    min = j;
 
           
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
 
    
    void pArray(int a[])
    {
        int n = a.length;
        for (int i=0; i<n; ++i)
            System.out.print(a[i]+" ");
        
    }
 
    
    public static void main(String args[])
    {
        Main s = new Main();
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        s.sort(a);
        System.out.println("Sorted array");
        s.pArray(a);
    }
}
