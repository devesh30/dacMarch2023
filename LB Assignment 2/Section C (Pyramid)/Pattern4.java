class Pattern4
{
	public static void main(String[] args)
	{
		for(int i=1;i<=9;i++)
		{
			for(int k=8;k>=i;k--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int m=i-1;m>=1;m--)
			{
				System.out.print(m+" ");
			}				
		System.out.println();
		}
	}
}