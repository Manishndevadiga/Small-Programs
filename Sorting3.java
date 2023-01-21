import java.util.*;
public class Sorting3 {
	public static void main(String args[])
	{
		System.out.print("Enter the nth largest no.= ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[] {1,5,3,18,7,4,6,9};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		if(n<=arr.length) {
		System.out.print(arr[n-1]);}else
		{
			System.out.print("Out of boundry");
		}
		
	}	
}

