package number;

public class arrayIntersectionJava {

	public static void main(String[] args)
	{
		int a[]={1,3,5,6,8};
		int b[]={1,3,55,6,8};
		int c[]=new int[50];
		int i,j,k=0;
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(a[i]==b[j])
				{
					c[k]=b[j];
					k++;
				}
			}
		}
		for(i=0;i<5;i++)
		{
			if(c[i]!=0)
			{
				System.out.print(" "+c[i]);
			}
		
		}
	}

}
