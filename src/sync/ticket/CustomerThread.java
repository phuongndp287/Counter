package sync.ticket;

class CustomerThread extends Thread {
    private TicketCounter ticketCounter;
    private int quantity;
    String name;

    public CustomerThread(TicketCounter ticketCounter, int quantity, String name) {
        this.name = name;
        this.ticketCounter = ticketCounter;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        ticketCounter.buyTickets(quantity, name);
    }
}