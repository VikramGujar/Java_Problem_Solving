package com.lab.dec_17;

public class EducationInstitute 
{
	
	private Course courses[];
	private Offer offers[];
	
	

	public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
		
	}



	public Course[] getCourses() {
		return courses;
	}



	public Offer[] getOffers() {
		return offers;
	}
	
	public void enrollStudentInCourse(int courseId, String studentName) {
		System.out.println("Student ID :"+courseId+" Student Name:"+studentName);
	}
	
	
}
/*

Constructor to initialize courses and offers.

-> : Returns the array of available courses.

-> getOffers(): Returns the array of ongoing offers.

-> : 
Simulates the enrollment process and prints a message when a student -> enrolls in a course.
*/