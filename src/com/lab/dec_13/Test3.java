package com.lab.dec_13;

class Job extends Thread 
{
    private Integer number = 0;
    public void run() 
    {
        for (int i = 1; i < 1000000; i++) 
	{
            number++;	// Plus number till 999999
        }
    }
    public Integer getNumber() 
    {
        return number;	// Returns number that is 999999 now
    }
}
public class Test3 {
    public static void main(String[] args) {
        Job thread = new Job(); // Object created for Job Thread class
        thread.start(); // Job Thread will start
		try
		{
			thread.join();	// Main will wait to complete Job thread
		}
		catch (Exception e)
		{
		}
		/**
		 * Will execute after completion of Job thread
		 * Call goes to getNumber method of Job class
		 * 
		 */
        System.out.println(thread.getNumber());	
    }
}

/*
 * Output : 9999
 */