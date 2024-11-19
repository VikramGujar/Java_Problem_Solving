package com.vikram.assignment;

public class MainCourse {

	public static void main(String[] args) {
		
		Video v = new Video("My Video", 45);
		
		Article a = new Article(null, null);
		
		Quiz q = new Quiz(null, 0);
		
		CourseManager c = new CourseManager();
		
		c.processContent(v);
		c.processContent(a);
		c.processContent(q);
		
		

	}

}
