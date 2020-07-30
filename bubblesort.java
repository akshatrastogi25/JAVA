import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j,t=0;
        int ar[]=new int[n];
        Boolean swap=false;
        for(i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=1;j<n;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    swap=true;
                    
                    t=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=t;

                }
              
                else{
                    swap=false;
                    break;
                }
              
            }
        }

        for(i=0;i<n;i++)
        {
            System.out.println(ar[i]);
        }
    }
}
