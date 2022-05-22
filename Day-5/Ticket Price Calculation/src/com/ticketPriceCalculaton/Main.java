package com.ticketPriceCalculaton;

public class Main {

	public static void main(String[] args) {
		
		Ticket t1=new Ticket();
		t1.setAvailableTickets(25);
		t1.setPrice(100);
		t1.setTicketid(123);
		
		
		System.out.println("available tickets: "+t1.getAvailableTickets());
		System.out.println("price per ticket: "+t1.getPrice());
		
		int numberOfTicketBooking=5;
		
		int totalPrice=t1.calculateTicketCost(numberOfTicketBooking);
		System.out.println("Number of tickt booked :"+numberOfTicketBooking);
		System.out.println("ticket id: "+t1.getTicketid());
		System.out.println("total price: "+totalPrice);
		System.out.println("available tickets: "+t1.getAvailableTickets());
		
		System.out.println("-----------------------------------------");
		
		Ticket t2=new Ticket();
		t2.setPrice(100);
		t2.setTicketid(124);
		
		System.out.println("available tickets: "+t2.getAvailableTickets());
		System.out.println("price per ticket: "+t2.getPrice());
		
		numberOfTicketBooking=2;
		
		totalPrice=t2.calculateTicketCost(numberOfTicketBooking);
		System.out.println("Number of ticket booked: "+numberOfTicketBooking);
		System.out.println("ticket id: "+t2.getTicketid());
		System.out.println("total price: "+totalPrice);
		System.out.println("available tickets: "+t2.getAvailableTickets());
	}
}
