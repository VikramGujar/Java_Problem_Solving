package com.vikram.test;

public class Superhero {

	

	    private int heroId;
	    private String heroName;
	    private String superPower;
	    private int strengthLevel;
	    private boolean isActive;

	    public Superhero(int heroId, String heroName, String superPower, int strengthLevel, boolean isActive){
	        this.heroId = heroId;
	        this.heroName = heroName;
	        this.superPower = superPower;
	        this.strengthLevel = strengthLevel;
	        this.isActive = isActive;

	    }

	    public void changePower(String newPower){
	        this.superPower = newPower;
	        System.out.println("New superPower is: "+this.superPower);
	    }

	    public void increaseStrength( int increment){
	        int newStreanth = this.strengthLevel + increment;
	        this.strengthLevel = newStreanth;
	        System.out.println("New StrengthLevel is: "+this.strengthLevel);
	    }

	    public void activateHero(){
	        this.isActive = true;
	        System.out.println("superhero is ready for action");
	    }

	    public void deactivateHero(){
	        this.isActive = false;
	        System.out.println("superhero is taking break from action");
	    }

		@Override
		public String toString() {
			return "Superhero [heroId=" + heroId + ", heroName=" + heroName + ", superPower=" + superPower
					+ ", strengthLevel=" + strengthLevel + ", isActive=" + isActive + "]";
		}

	   



}
