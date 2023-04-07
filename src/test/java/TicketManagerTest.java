import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TicketManagerTest {
    @Test
    public void testSortTickets() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "MSK", "SPB", 200, 95);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 100, 99);
        Ticket ticket3 = new Ticket(3, "MSK", "LA", 500, 300);
        Ticket ticket4 = new Ticket(4, "MSK", "UFA", 250, 95);
        Ticket ticket5 = new Ticket(5, "MSK", "SPB", 250, 130);
        Ticket ticket6 = new Ticket(6, "NEW", "SPB", 600, 95);
        Ticket ticket7 = new Ticket(7, "MSK", "SPB", 150, 97);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket2, ticket7, ticket1, ticket5};
        Ticket[] actual = manager.findAll("MSK", "SPB");
        assertArrayEquals(expected, actual);
    }
}