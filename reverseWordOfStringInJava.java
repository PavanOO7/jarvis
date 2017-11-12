package number;

public class reverseWordOfStringInJava
{
	public static void main(String[] args)
	{ 
		int end;		
		int i;
        String st1= "I am A boy";
        int len = st1.length();
        char[] ch1 = new char[100];
        char[] ch2 = new char[100];
        end=len;
        int t=0;
        int temp=end;
        for (i = 0; i < len; i++) 
        {
            ch1[i] = st1.charAt(i);
        }        
		for( i=end;i>0;i--)
		{
			if(ch1[i]==' ')
			{
				int i1=i+1;				
				for(int l=i1;l<=temp;l++)
				{
					ch2[t]=ch1[l];
					t++;
				}				
				temp=i;
			}
		}
		
		for(int i2=i;i2<=0;i2++)
		{
		    ch2[t]=ch1[i2];
		}
		
		for(int i2=0;i2<ch2.length;i2++)
		{
		     System.out.print(""+ch2[i2]);
		}
	}
}
