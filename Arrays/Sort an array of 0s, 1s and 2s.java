//This question contains two methods and each method is commented;
public class Main
{   
    static void sortArr(int a[],int n)
    {
        //Method 1 : take count variables count0,count1,count2 and traverse the array and count them respectively;
        // int c0=0,c1=0,c2=0;
        // for(int k:a)
        // {
        //     switch(k)
        //     {
        //     case 0:c0++;
        //         break;
        //     case 1:c1++;
        //         break;
        //     case 2:c2++;
        //         break;
        //     }
        // }
    
        // int i=0;
        // while(c0>0)
        // {
        //     a[i++]=0;c0--;
        // }
        //  while(c1>0)
        // {
        //     a[i++]=1;c1--;
        // }
        //  while(c2>0)
        // {
        //     a[i++]=2;
        //     c2--;
        // }
        //Method 2: optimized dutch flag algo
        // int l=0;
        // int m=0;
        // int h=n-1;
        // int temp;
        //  while(m<=h)
        //  {
        //     switch(a[m])
        //     {
        //         case 0:
        //             temp=a[m];
        //             a[m]=a[l];
        //             a[l]=temp;
        //             l++;m++;
        //             break;
        //         case 1:m++;
        //             break;
        //         case 2:
        //             temp=a[m];
        //             a[m]=a[h];
        //             a[h]=temp;
        //             h--;
        //             break;
        //     }
        //  }
}
    
	public static void main(String[] args) {
		 int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
        int n = arr.length; 
        sortArr(arr, n); 
         for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " ");
	}
}
