package sync.ticket;

public class TicketCounter {

    private int availableTickets;

    public TicketCounter(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public void buyTickets(int quantity, String name) {
        if (availableTickets >= quantity) {
            System.out.println(name + " mua " + quantity + " vé.");
            availableTickets -= quantity;
        } else {
            System.out.println(name + " không thể mua vé. Số vé còn lại: " + availableTickets);
        }
    }
}
