package com.lab.dec_17;

public class Student implements Runnable {

	private String name;
	private EducationInstitute institute;
	
	
	public Student(String name, EducationInstitute institute) {
		super();
		this.name = name;
		this.institute = institute;
	}
	
	public void viewCoursesAndFees() {
		
		System.out.println("Available courses : ");
		for(Course course :institute.getCourses()) {
			
			System.out.println(course.toString());
			
		}
	}
	
	public void viewOffers() {
		for(Offer offer : institute.getOffers()) {
			
			System.out.println(offer.getOfferText());
		}
	}
	
	public Course enrollInCourse(int courseId) {
		for(Course course :institute.getCourses()) {
			if(course.getCourseId() == courseId) {
				return course;
			}
		}
		System.out.println("Course with this id is not available");
	return null;
	}

	@Override
	public void run() {
		viewCoursesAndFees();
		viewOffers();
		System.out.println(enrollInCourse(101)); 
		
	}
	
}
