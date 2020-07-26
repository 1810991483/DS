import java.util.*;
class DuplicateElement
{
    public static void main(String[] args) 
    {
        int n;
       // int[] a = {2, 6, 7, 6, 2, 19, 1, 19};
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        HashSet<Integer> numSet = new HashSet<Integer>();
        for(int num : a){
            
            if(!numSet.add(num)){
                System.out.println(num);
            }
        }
    }
}
