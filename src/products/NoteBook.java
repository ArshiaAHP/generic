package products;

public class NoteBook extends Product{
    private int pageCount;
    private boolean isHardCover;
    private static int count = 0; //counting for ID


    public NoteBook(String title, double price, int pageCount, boolean isHardCover){
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
        count++;
    }

    public String toString(){
        return super.toString() + " | p.Count: " + pageCount + " | is hard cover: " + isHardCover;
    }

    @Override
    protected String generateID() {
        return "2" + String.format("%03d", count);
    }

    //setters and getters
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }
}
