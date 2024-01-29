public class Book {
    private String name;
    private double price;
    private int qty;
    private Author author;

    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString(){
        return "'"+name+"'"+" by "+author;
    }
}
