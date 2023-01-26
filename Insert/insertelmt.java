public class insertelmt {
	public static void main(String args[])
	{ 
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9,10};
		int n=arr.length-1;
         int k=3;
         for(int i=n;i>=k;i--)
         {
        	 arr[i]=arr[i-k];
        	 if(i<=5)
        	 {
        		 break;
        	 }
         }
         for(int i=0;i<arr.length;i++)
         {
        	 System.out.print(arr[i]+" ");
         }
	}
}