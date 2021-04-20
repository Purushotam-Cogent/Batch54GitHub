import java.lang.*;
public class JenkinsDemo
{
	public static void main(String ar[])
	{
System.out.println("Welcome to Jenkins Demo \n Message display below using Threads ");
	for(int i=0;i<ar.length;i++)
	{
		try{
		System.out.print(ar[i]+" ");
		Thread.sleep(500);
		}catch(Exception e)
		{}
		
	}
	}
}	