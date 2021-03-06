package zhenya.workshop_7;

public class Table {

    private int stockNumber;
    private String title;
    private int price;

    public int getStockNumber() {
        return stockNumber;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public Table(int stockNumber, String title, int price) {
        this.stockNumber = stockNumber;
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Table) && ((Table) o).getPrice() == this.price && ((Table) o).getTitle().equals(this.title);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Table{stockNumber=%d, title='%s', price=%d}", getStockNumber(), getTitle(), getPrice());
    }
}
