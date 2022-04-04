package com.mycompany.command_facade_assignment;

/**
 *
 * @author Jasmine Kaur
 */
public class Customer {
	Website website;
	Online_Order order;
	public Customer(Website website) {
		this.website = website;
	}
	public void createOrder(Online_Order order) {
		this.order = order;
	}
	public void clicks_submit_button() {
		website.acceptOrder(order);
	}
}