package com.mycompany.command_facade_assignment;
/**
 *
 * @author Jasmine Kaur
 */
public class Facade_Junit_test {
    
    
    
    public void test2_facade_pattern()
    {
         Sticker_Maker sm = new Sticker_Maker();
		Website website = new Website();
		Customer customer = new Customer(website);
		
                All_Top_Characters_Stickers_Facade atcsf = new All_Top_Characters_Stickers_Facade(sm);
                customer.createOrder(atcsf);
                
                assert(atcsf.equals(customer.order));
    }
    
    

    
}
