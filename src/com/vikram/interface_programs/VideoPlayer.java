package com.vikram.interface_programs;

public class VideoPlayer implements AdvancedmediaPlayer {
	
	private String Title ;
	
	

	public VideoPlayer(String title) {
		super();
		if(title == "")
		{
			System.err.println("Title is not be empty string.");
			System.exit(0);
		}else 
		{
			this.Title = title;
		}
	}

	@Override
	public void play() {
		System.out.println("Video Playing : "+this.Title);
		
	}

	@Override
	public void stop() {
		System.out.println("Video Playing : "+this.Title);
		
	}

	@Override
	public void pause() {
		System.out.println("Video Playing : "+this.Title);
		
	}

		

	
}
