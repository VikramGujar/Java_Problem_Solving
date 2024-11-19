package com.vikram.assignment;

public class Video extends CourseContent {
	
	private int duration;

	public Video(String title, int duration) {
		super(title);
		if(duration < 1) {
			System.err.println("Invalid Duration for Video");
			System.exit(duration);
		}else {
			this.duration = duration;
		}
		
	}

	public int getDuration() {
		return duration;
	}

	@Override
	public String toString() {
		return "Video [getTitle()=" + getTitle() + ", duration=" + duration + "]";
	}

	
}
