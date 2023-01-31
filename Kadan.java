
public class Kadan {
	public static void main(String args[])
	{
		int arr[] = new int[] {-1,8,2,7,-3,4,5};
		int a[] = new int[arr.length];
		 int submax=Integer.MIN_VALUE;
		 int sindx=0,eindx=0;
		for(int i=0;i<arr.length;i++)
		{
			int cs=0; 
			int max=Integer.MIN_VALUE;
			int j=i;
			while(j<arr.length)
			{
				cs+=arr[j];
				if(max<cs)
				{
					max=cs;
					eindx=j;
				}
				j++;
			}
			a[i]=max;
			if(submax<max)
			{
				submax=max;
				 sindx=i;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(submax);
		System.out.println("satrting index =" +sindx);
		System.out.print("ending index =" +eindx);
   }
}