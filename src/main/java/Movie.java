import java.util.ArrayList;
import java.util.List;

public class Movie {
    private final String title;
    Director director;
    private final String genre;
    private final String date;
    private final List<Actor> actors;

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDate() {
        return date;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public Movie(String title, Director director, String genre, String date, ArrayList<Actor> actors) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.date = date;
        this.actors = actors;
    }
}

