package com.vikram.interface_programs;

public class MusicPlayer implements AdvancedmediaPlayer {
	
	private String Title ;
	
	

	public MusicPlayer(String title) {
		super();
		if(title == "")
		{
			System.err.println("Title is not be empty string.");
			System.exit(0);
		}else {
			this.Title = title;
		}
		
	}

	@Override
	public void play() {
		System.out.println("Music Playing : "+this.Title);
		
	}

	@Override
	public void stop() {
		System.out.println("Music Stopped : "+this.Title);
		
	}

	@Override
	public void pause() {
		System.out.println("Music Paused : "+this.Title);
		
	}

	

	
}
