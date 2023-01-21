import java.util.*;
public class Array {
	
public static void main(String args[])
{
	int z=10;
int arr[][]= new int[3][4];	
for (int i=0;i<arr.length;i++)
{
	for (int j=0;j<arr[0].length;j++)
	{
		arr[i][j]=z;
		z++;
	}
	System.out.println();
}


for (int i=0;i<arr.length;i++)
{
	for (int j=0;j<arr[0].length;j++)
	{
		System.out.print(arr[i][j]+ " ");
	}
	System.out.println();
}
int trans[][]= new int[4][3];	
for (int i=0;i<arr.length;i++)
{
	for (int j=0;j<arr[0].length;j++)
	{
		trans[j][i]=arr[i][j];
	}
	System.out.println();
}
for (int i=0;i<trans.length;i++)
{
	for (int j=0;j<trans[0].length;j++)
	{
		System.out.print(trans[i][j]+ " ");
	}
	System.out.println();
}
}
}
