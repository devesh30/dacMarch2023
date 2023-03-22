class Pattern5
{
	public static void main(String[] args)
	{
		for(int i=9;i>=1;i--)
		{
			for(int k=i;k>=2;k--)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=9;j++)
			{
				System.out.print(j+" ");
			}
			for(int m=8;m>=i;m--)
			{
				System.out.print(m+" ");
			}				
		System.out.println();
		}
	}
}