package com.ticketPriceCalculaton;
 import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the available tickets:");
		int ticketAvilable=s.nextInt();
		Ticket t1=new Ticket();
		t1.setAvailableTickets(ticketAvilable);
		while(ticketAvilable>0) {
			System.out.println("Enter no of bookings: ");
			int numberOfBookings=s.nextInt();
			System.out.println("Enter the price");
			int price=s.nextInt();
			System.out.println("Enter the ticketid: ");
			int ticketId=s.nextInt();
			
			int numberOfTicketBooking=numberOfBookings;
			t1.setTicketid(ticketId);
			t1.setPrice(price);
			System.out.println("available tickets: "+t1.getAvailableTickets());
			int totalPrice=t1.calculateTicketCost(numberOfTicketBooking);
			
			System.out.println("Total amount: "+totalPrice);
			System.out.println("available tickets after booking: "+t1.getAvailableTickets());
		}
		s.close();
	}
}
