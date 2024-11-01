package com.vikram.creadit_card;

public class CardsOnOffer {
	
	public static CardType getOfferedCard(Customer ct) {
		
		int creditPoints = ct.getCreditPoints();
		
		if(creditPoints >=100 && creditPoints<=500) {
			return new CardType(ct,"Silver");
		}else if(creditPoints >500 && creditPoints<=1000) {
			return new CardType(ct,"Gold");
		}else if(creditPoints>1000) {
			return new CardType(ct,"Platinum");
		}else {
			return new CardType(ct,"EMI");
		}
		
	}
	

}
