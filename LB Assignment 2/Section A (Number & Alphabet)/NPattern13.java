class NPattern13
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			int c=64;
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(c+i)+" ");
			}			
		System.out.println();
		}
	}
}