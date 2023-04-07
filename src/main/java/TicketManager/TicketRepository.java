
package TicketManager;

public class TicketRepository {
    public Ticket[] tickets = new Ticket[0];

    public Ticket[] findAll() {
        return tickets;
    }

    public void add(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];

        int i;
        for (i = 0; i < tickets.length; i++) ;
        tmp[i] = tickets[i];


        tmp[tmp.length ] = ticket;
        tickets = tmp;
    }


    public class Ticket {
    }


}

