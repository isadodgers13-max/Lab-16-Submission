import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<MediaItem> items = new ArrayList<>();

        items.add(new Book("The Hobbit", 1937, "J.R.R. Tolkien"));
        items.add(new Movie("Inception", 2010, "Christopher Nolan"));
        items.add(new Book("1984", 1949, "George Orwell"));

        for (MediaItem item : items) {
            item.printDetails(); // polymorphism
        }

        System.out.println("\nTotal Media Items: " + MediaItem.getCount());
    }
}
