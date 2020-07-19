import java.util.*;
class DuplicateElement
{
    public static void main(String[] args) 
    {
        int[] a = {2, 6, 7, 6, 2, 19, 1, 19};
        HashSet<Integer> numSet = new HashSet<Integer>();
        for(int num : a){
            
            if(!numSet.add(num)){
                System.out.println(num);
            }
        }
    }
}
