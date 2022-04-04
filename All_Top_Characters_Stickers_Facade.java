package com.mycompany.command_facade_assignment;

/**
 *
 * @author Jasmine Kaur
 */
public class All_Top_Characters_Stickers_Facade implements Online_Order{
    Sticker_Maker sm;
	public All_Top_Characters_Stickers_Facade(Sticker_Maker sm) {
		this.sm = sm;
	}
	public void orderReceived(){
                System.out.println("\nAll Top Characters Stickers Facade Activated! Printing best stickers!");
		sm.printIronManSticker();
                sm.printBatManSticker();
                sm.printCapAmSticker();
		
	}
}
