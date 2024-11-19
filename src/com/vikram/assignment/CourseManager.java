package com.vikram.assignment;

public class CourseManager {

	public void processContent(CourseContent content) 
	{
	    if (content instanceof Video) 
	    {
	        System.out.println("Processing video content..."+content);
	       
	    } else if (content instanceof Article) 
	    {
	       
	        System.out.println("Processing article content..."+content);
	        
	    } else if (content instanceof Quiz) 
	    {
	        
	        System.out.println("Processing quiz content..."+content);
	        
	    } else {
	        System.out.println("Unknown content type. Unable to process.");
	    }
	}


	
}
