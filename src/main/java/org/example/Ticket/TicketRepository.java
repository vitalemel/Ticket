


package org.example.Ticket;


public class TicketRepository {

    int Ticket[] = new int[0];
    private Ticket ticket;
    private Ticket[] tickets = new Ticket[0];


    public void add(Ticket ticket) {
        this.ticket = ticket;


        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];

        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }


    public Ticket[] findAll() {

        return tickets;
    }
}
