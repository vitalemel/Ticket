package org.example.Ticket;


import java.util.Arrays;


public class TicketManager {


    private TicketRepository repository;
    private Ticket ticket;


    public TicketManager(TicketRepository repository) {
        this.repository = repository;
    }


    public void add(Ticket ticket) {
        repository.add(ticket);
    }


    public Ticket[] findAll(String from, String to) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repository.findAll()) {
            if (matches(ticket, from, to)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[result.length] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;

    }


    private boolean matches(Ticket ticket, String from, String to) {
        if (from.equals(ticket.getFrom())) {
            if (to.equals(ticket.getTo())) {
                return true;
            }
        }
        return false;
    }
}

