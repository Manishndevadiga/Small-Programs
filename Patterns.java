import java.util.*;
public class Patterns {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int n=sc.nextInt();
		boolean isprime=true;
		if(n==2)
		{
			isprime=true;
		}
		else
		{
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
				{
					isprime=false;
					break;
				}
			}
		}
		 if(isprime==true)
		       {
		          	System.out.println(n+ " is Prime");
		       }
		else
			   {
			System.out.println(n+ " is not Prime"); 
			    }
	}}