package com.mycompany.command_facade_assignment;

/**
 *
 * @author Jasmine Kaur
 */
public class Website {
	Online_Order order;
	public Website() {}
	public void acceptOrder(Online_Order order) {
		this.order = order; 
		order.orderReceived();
	}
}