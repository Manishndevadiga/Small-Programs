
public class Prefix {
public static void main(String args[])
{
	int arr[]=new int[] {-1,20,-3,4,-5};
	
	int pfx[] =new int[arr.length];
	pfx[0]=arr[0];
	int max=Integer.MIN_VALUE;
	for(int i=1;i<arr.length;i++)
	{
		pfx[i]=arr[i]+pfx[i-1];
	}
	for(int i=0;i<pfx.length;i++)
	{
		for(int j=i;j<pfx.length;j++)
		{
			if(i==0)
			{
				max=Math.max(max, pfx[j]);
			}else
			{
				max=Math.max(max, pfx[j]-pfx[i-1]);
			}
		
		}	
	}
	System.out.println(max);
}
}
