import java.util.Scanner;
class ProgrameTest3
 {
	public static void main(String[] args) 
	{
		int k;
		System.out.println("Enter the value of n");                            
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for (int i=1;i<=n;i++)
		{   int l=1;
			if (i%2!=0)
			{
				k=i;
			}
			else
				k=i+1;
			for (int j=1;j<=k;j++)
			{  
				System.out.print(l+" ");
				l=l+2;
			}	
			System.out.println(); 
		}
	}
}

