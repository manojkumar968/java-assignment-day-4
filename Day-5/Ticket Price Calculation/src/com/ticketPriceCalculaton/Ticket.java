package com.ticketPriceCalculaton;

public class Ticket {

	private int ticketid;
	private int price; 
	private  static int availableTickets; 
	
	
	void setTicketid(int ticketid) {
		this.ticketid=ticketid;
	}
	
	int getTicketid() {
		return ticketid;
	}
	
	void setPrice(int price) {
		this.price=price;
	}
	
	int getPrice() {
		return price;
	}
	
	
	void setAvailableTickets(int availableTickets){
		if(availableTickets>0) {
			Ticket.availableTickets=availableTickets;
		}
	}
	
	int getAvailableTickets() {
		return availableTickets;
	}
	
	public int calculateTicketCost(int nooftickets) {
		if(nooftickets<=Ticket.availableTickets) {
			int totalPrice=nooftickets*price;
			Ticket.availableTickets-=nooftickets;
			return totalPrice;
		}
		
		return -1;
	}
}
