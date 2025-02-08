import java.lang.*;
class Fact
{
 

public static void main (String args [])
{
		
  int num =Integer.parseInt(args[0]);
  int i,f=1 ;
  for(i=num;i>=1;i--)
   f=f*i;
  
System.out.println("Factorial="+f);	




}





}