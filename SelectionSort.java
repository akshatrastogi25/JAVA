import java.util.*;
public class SelectionSort
{
   public static void main(String args[])
   {
      int size, i, j, temp, small, index, count=0;
      int arr[] = new int[50];
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter Array Size : ");
      size = scan.nextInt();
      System.out.print("Enter Array Elements : ");
      for(i=0; i<size; i++)
      {
         arr[i] = scan.nextInt();
      }
      System.out.print("Sorting Array using Selection Sort Technique..\n");
      for(i=0; i<(size-1); i++)
      {
         small = arr[i];
         for(j=(i+1); j<size; j++)
         {
            if(small>arr[j])
            {
               small = arr[j];
               count++;
               index = j;
            }
         }
         if(count!=0)
         {
            temp = arr[i];
            arr[i] = small;
            arr[index] = temp;
         }
         count=0;
      }
      System.out.print("Now the Array after Sorting is :\n");
      for(i=0; i<size; i++)
      {
         System.out.print(arr[i]+ "  ");
      }
   }
}