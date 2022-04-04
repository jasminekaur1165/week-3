package com.mycompany.command_facade_assignment;

/**
 *
 * @author Jasmine Kaur
 */
public class Online_Sticker_Shop_Simulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Sticker_Maker sm = new Sticker_Maker();
		Website website = new Website();
		Customer customer = new Customer(website);
		Iron_Man_Sticker_Order imso = new Iron_Man_Sticker_Order(sm);
		customer.createOrder(imso);
		customer.clicks_submit_button();
                
        customer.createOrder(new All_Top_Characters_Stickers_Facade(sm));
        customer.clicks_submit_button();
	}
    
}
