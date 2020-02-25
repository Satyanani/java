import java.util.Scanner;
class ElectricityBill
{
  public static void main(String args[])
   {
     long cn ;
     int pmr,cmr;
     Scanner s=new Scanner(System.in);
     System.out.println("enter the consumer number");
     cn=s.nextLong();
     System.out.println("enter the consumer name");
     String cname=s.next();
     System.out.println("enter the previous month reading and current month reading");
     pmr=s.nextInt();
     cmr=s.nextInt();
     int total=pmr+cmr;
     System.out.println("enter your type EB connection 1.Domestic or 2.Commercial");
     int eb=s.nextInt();
     if(eb==1)
     {
       if(total<=100)
        {
          System.out.println("value of electricity bill is: " + total);
        }
       else if(total<=200)
        {
	  System.out.println("value of electricity bill is: " + total*2.5 );
        }
       else if(total<=500)
        {
	  System.out.println("value of electricity bill is: " + total*4 );
        }
       else
        {
	  System.out.println("value of electricity bill is: " + total*6 );
        } 
     }
     else
     {
       if(total<=100)
        {
          System.out.println("value of electricity bill is: " + total*2 );
        }
       else if(total<=200)
        {
	  System.out.println("value of electricity bill is: " + total*4.5 );
        }
       else if(total<=500)
        {
	  System.out.println("value of electricity bill is: " + total*6 );
        }
       else
        {
	  System.out.println("value of electricity bill is: " + total*7 );
        } 
      }
   }
}