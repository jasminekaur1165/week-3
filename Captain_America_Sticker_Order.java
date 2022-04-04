package com.mycompany.command_facade_assignment;

/**
 *
 * @author Jasmine Kaur
 */
public class Captain_America_Sticker_Order implements Online_Order {
    Sticker_Maker sm;
	public Captain_America_Sticker_Order(Sticker_Maker sm) {
		this.sm = sm;
	}
	public void orderReceived(){
		sm.printCapAmSticker();
		
	}
    
}
