package com.mycompany.command_facade_assignment;


/**
*
* @author Jasmine Kaur
*/
public class Command_Pattern_Test {
   
   
   
   public void test1_command_pattern()
   {
        Sticker_Maker sm = new Sticker_Maker();
		Website website = new Website();
		Customer customer = new Customer(website);
               Iron_Man_Sticker_Order imso = new Iron_Man_Sticker_Order(sm);
		customer.createOrder(imso);
               
               
               assert(imso.equals(customer.order));
   }
   
   

   
}

