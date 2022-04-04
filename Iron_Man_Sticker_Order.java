package com.mycompany.command_facade_assignment;

/**
 *
 * @author Jasmine Kaur
 */
public class Iron_Man_Sticker_Order implements Online_Order {
	
	public Iron_Man_Sticker_Order(Sticker_Maker sm) {
		this.sm = sm;
	}
	Sticker_Maker sm;
	public void orderReceived(){
		sm.printIronManSticker();
		
	}
}
