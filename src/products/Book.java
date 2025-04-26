package products;

public class Book extends Product{
    private String author;
    private String publication;
    private String genre;
    private static int count = 1;//counting for ID
    public Book(String title, double price, String author, String publication, String genre){
        super(title, price);
        this.author = author;
        this.genre = genre;
        this.publication = publication;
        count++;
    }

    public String toString(){
        return super.toString() + " | Book Genre: " + this.genre + " | Author: " + this.author +
                " | Publication: " + this.publication;
    }

    @Override
    protected String generateID() {
        return "1" + String.format("%03d", count);
    }



    //setters and getters
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
