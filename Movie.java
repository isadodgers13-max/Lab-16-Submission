public class Movie extends MediaItem {
    private String director;

    public Movie(String title, int year, String director) {
        super(title, year);
        this.director = director;
    }

    @Override
    public void printDetails() {
        System.out.println(getTitle() + " (" + getYear() + ") — Movie directed by " + director);
    }
}
