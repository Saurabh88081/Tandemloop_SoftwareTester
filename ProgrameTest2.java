import java.util.Scanner;
class ProgrameTest2
 {
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the value of n");                            
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			int k=1;
			for (int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				//System.out.println();
				k=k+2;
			}

			System.out.println(); 
		}

		
	}
}


