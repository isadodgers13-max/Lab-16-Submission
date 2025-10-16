 public class MediaItem {
    private String title;
    private int year;
    private static int counter = 0;

    public MediaItem(String title, int year) {
        this.title = title;
        this.year = year;
        counter++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printDetails() {
        System.out.println(title + " (" + year + ")");
    }

    public static int getCount() {
        return counter;
    }
}
