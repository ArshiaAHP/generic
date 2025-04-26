package inventory;

import products.Product;

import java.util.ArrayList;

public class Inventory <T extends Product>{
    private ArrayList<T> items = new ArrayList<>();

    public void applyDiscount (String productName, int discount){
        for(T product: items){
            if(productName.equals(product.getTitle())){
                double newPrice = product.getPrice() * (100 - discount) / 100;
                product.setPrice(newPrice);
            }
        }
        throw new RuntimeException("Product with given name not found.");
    }

    public void addItems(T product){
        if(product != null){
            items.add(product);
        }else{
            throw new RuntimeException("product cannot be null.");
        }
    }

    public void removeItemsByID(String id){
        for(T product : items){
            if(product.getId().equals(id)){
                items.remove(product);
            }
        }
    }

    public T findItemById(String id) {
        for (T item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        System.out.println("Error: Product with ID: " + id + " not found!");
        return null;
    }

    public void displayAll() {
        for (T product : items) {
            System.out.println(product.toString());
        }
    }

    //setters and getters
    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }
}
