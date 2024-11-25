package com.vikram.interface_programs;

public class PlayerMain {

	public static void main(String[] args) {
		MusicPlayer mp = new MusicPlayer("Har har gange");
		mp.pause();
		mp.play();
		mp.stop();
		
		System.out.println("---------------------------");
		
		VideoPlayer vp = new VideoPlayer("");
		vp.pause();
		vp.play();
		vp.stop();
		
		
	}

}
