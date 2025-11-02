package pack1;

//      *
//    * * *
//  * * * * *
//* * * * * * *

public class Pattern2 {
	static int i;
	public void methd()
	{
		 for(int jj=2;jj<=i;jj++)
         {
             System.out.print(" *");
         }
         for(int kk=3;kk>=i;kk--)
         {
             System.out.print(" ");
         }
	}

	public static void main(String[] args) 
	{ 
		 for( i=1;i<=4;i++)
	        {
	            for(int j=3;j>=i;j--)
	            {
	                System.out.print("  ");
	            }
	            for(int k=1;k<=i;k++)
	            {
	                System.out.print(" *");
	            }
	            Pattern2 m = new Pattern2();
	           m.methd();
	            System.out.println();
	        }  
	}

}
