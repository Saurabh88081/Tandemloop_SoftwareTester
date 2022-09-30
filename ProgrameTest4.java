import java.util.Scanner;
class ProgrameTest4 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		int a[]=new int[11];
		System.out.println("enter the elements");
		for(int i=0;i<=10;i++)
		{
			a[i]=ob.nextInt();
		}
        System.out.println("answer is ......");
		int res[]=new int[9];
		int k=0;
		for(int i=1;i<=9;i++)
		{
			int count=0;
			for(int j=0;j<=10;j++)
			{
				if (a[j]%i==0)
				{
					count++;
				}
			}
			res[k]=count;
			k++;
			}
			for(int i=0; i<=res.length-1;i++)
			{
				System.out.println("{"+(i+1)+":"+res[i]+"}");
	        }
}
}
