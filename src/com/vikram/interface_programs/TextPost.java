package com.vikram.interface_programs;

public class TextPost implements Post {
	
	String textContent;
	int like;
	
	

	public TextPost(String textContent) {
		super();
		this.textContent = textContent;
		this.like = 0;
	}

	@Override
	public void publish() {
		System.out.println("Post 1:"+this.textContent+"\nLikes:"+this.like); 
		
	}

	@Override
	public void like() {
		this.like++;
		System.out.println("Post Liked! \nTotal likes:"+this.like);
		
	}

}
