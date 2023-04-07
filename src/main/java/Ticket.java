
public class Ticket implements Comparable<Ticket> {

    private int length;
    private int id;
    private String from;

    private String to;

    private int price;
    private int duration;


    public Ticket(int id, String from, String to, int price, int duration) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.price = price;
        this.duration = duration;


    }

    public int getId() {
        return id;

    }

    public int getDuration() {
        return duration;
    }

    public int getPrice() {
        return price;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    @Override
    public int compareTo(Ticket o) {
        if (price < o.getPrice()) {
            return -1;
        }
        if (price > o.getPrice()) {
            return 1;
        }
        return 0;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}