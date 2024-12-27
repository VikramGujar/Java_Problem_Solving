package com.lab.dec_26;

public class Test1
{
    public static void main(String args[])
    {
      {
         new Thread()
         {
            @SuppressWarnings("unused")
			public void run()
              {
            	for(int i=1;i<=(3^5);i++)
            	{
                System.out.println("Enjoy Your NewPlatForm..."+i);
                break;
            	}
              }
         }.start();

        new Thread()
           {
              public void run()
               {
            	for(int i=1;i<=(3^5);i++)//	3 XOR 5 = 6
              	{
            	
            		  if(i==(3^4))//3 XOR 4 = 7
                  System.out.println("Experience this NewPlatForm..."+i);
              	}
               }
           }.start();

      }
   } 
}


