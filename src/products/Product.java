package products;

public abstract class Product {
    private String title;
    private double price;
    private String id;

    public Product(String title,double price){
        this.title = title;
        this.price = price;
        this.id = generateID();
    }

    public String toString(){
        return title + " | " + price;
    }

    protected abstract String generateID();

    //setter & getter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
