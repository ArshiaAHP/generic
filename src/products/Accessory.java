package products;

public class Accessory extends Product{
    private String Color;
    private static int count = 0;//counting for ID

    public Accessory(String title, double price, String color) {
        super(title, price);
        this.Color = color;
        count++;
    }

    @Override
    protected String generateID() {
        return "3" + String.format("%03d", count);
    }

    //setters and getters
    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
