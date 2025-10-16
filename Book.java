public class Book extends MediaItem {
    private String author;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    @Override
    public void printDetails() {
        System.out.println(getTitle() + " (" + getYear() + ") — Book by " + author);
    }
}
