//to find kth min element in O(n) time complexity
import java.util.*;
public class Main
{
    static int QuickSelect(int a[],int l,int h,int k)
    {
           int pivot=a[h];//taking last elemet as pivot
           int pivot_index=partition(a,pivot,l,h);//partitioning the array with small values to left and large to rigth
           
           if(pivot_index>k)
               return QuickSelect(a,l,pivot_index-1,k);
           else if(pivot_index<k)
               return QuickSelect(a,pivot_index+1,h,k);
           else
                return a[pivot_index];
           
    }
    static int partition(int a[],int pivot,int l,int h)
    {
        int i=l;
        int j=l;
        while(i<=h)
        {
            if(a[i]<=pivot)
            {
                swap(a,i,j);
                i++;j++;
            }
            else
            i++;
        }
        return j-1;
    }
    static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();//size of array
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=s.nextInt();
		int k=s.nextInt();//kth index
		System.out.println(QuickSelect(a,0,n-1,k-1));
	}
}
