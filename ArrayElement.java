import java.util.Scanner;
public class ArrayElement
{
    public static void main(String args[])
	{
		
       int m,n,i;
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter the size of the array");
	   m=s.nextInt();
	   int a[]=new int[m];
	   System.out.println("enter the element:\n");
	   for(i=0;i<m;i++)
	   {
		   a[i]=s.nextInt();
	   }
	   System.out.println("enter the element want to search:");
	   n=s.nextInt();
	   for(i=0;i<m;i++)
	   {
		   if(a[i]==n)
		   {
			   System.out.println("element found at position:"+i);
                break;
		   }
	   }
		   if(i==m)
		   {
			   System.out.println("element not found");
		   }
	   
	}
}

     OUTPUT
  ------------ 
enter the size of the array
5
enter the element:

10
20
30
40
50
enter the element want to search:
20
element found at position:1

	   
