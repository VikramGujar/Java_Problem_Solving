package com.lab.dec_26;

public class Test4 
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
            	  for(int i=1;i<=(3^5);i++)
              	{
            		  int n=10;
            		  if(i==(n/=n/=2))
                  System.out.println("Experience this NewPlatForm..."+i);
              	}
               }
           }.start();

      }
   } 
}

/*
Enjoy Your NewPlatForm...1
Experience this NewPlatForm...2
*/