import inventory.Inventory;
import products.Book;
import products.NoteBook;
import products.Accessory;
import products.Product;


public class Main {
    public static void main(String[] args) {
        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<NoteBook> notebookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        bookInventory.addItems(new Book("Mystery in the Fog", 15, "John Smith", "Rainbow Press", "Crime"));
        bookInventory.addItems(new Book("The Last Summer", 10, "Emma Brown", "Sunset Books", "Romance"));

        notebookInventory.addItems(new NoteBook("Blue Grid Notebook", 7.5, 80, false));
        notebookInventory.addItems(new NoteBook("Black Leather Journal", 20, 200, true));

        accessoryInventory.addItems(new Accessory("Metal Bookmark", 5, "Silver"));
        accessoryInventory.addItems(new Accessory("Plastic Ruler", 2, "Green"));

        System.out.println("--- Books ---");
        bookInventory.displayAll();
        System.out.println("\n--- Notebooks ---");
        notebookInventory.displayAll();
        System.out.println("\n--- Accessories ---");
        accessoryInventory.displayAll();

        bookInventory.removeItemsByID("1001");
        notebookInventory.removeItemsByID("2001");

        System.out.println("\nTotal book value: " + calculateTotalPrice(bookInventory));
        System.out.println("Total notebook value: " + calculateTotalPrice(notebookInventory));
        System.out.println("Total accessory value: " + calculateTotalPrice(accessoryInventory));

        System.out.println("\nFinding product 1002:");
        Product found = bookInventory.findItemById("1002");
        if (found != null) System.out.println(found);

        System.out.println("\n##TEST## Finding non-existent product:");
        bookInventory.findItemById("9999");

        bookInventory.applyDiscount("The Last Summer", 10);
        accessoryInventory.applyDiscount("Metal Bookmark", 20);


        System.out.println("\n--- Final Inventory ---");
        System.out.println("Books:");
        bookInventory.displayAll();
        System.out.println("\nNotebooks:");
        notebookInventory.displayAll();
        System.out.println("\nAccessories:");
        accessoryInventory.displayAll();
    }

    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double total = 0;
        for (Product item : inventory.getItems()) {
            total += item.getPrice();
        }
        return total;
    }
}