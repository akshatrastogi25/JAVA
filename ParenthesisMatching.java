import java.util.*;
 
public class ParenthesisMatching
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Enter expression");
        String exp = s.next();        
        int len = exp.length();
        System.out.println("\nMatches and Mismatches:\n");
        for (int i = 0; i < len; i++)
        {    
            char ch = exp.charAt(i);
            if (ch == '(')
                stack.push(i);
            else if (ch == ')')
            {
                try
                {
                    int p = stack.pop() + 1;
                    System.out.println("')' at index "+(i+1)+" matched with ')' at index "+p);
                }
                catch(Exception e)
                {
                    System.out.println("')' at index "+(i+1)+" is unmatched");
                }
            }            
        }
        while (!stack.isEmpty() )
            System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
    }
}