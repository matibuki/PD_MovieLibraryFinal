import java.util.ArrayList;
import java.util.List;

public class Movie {


    private String title;
    Director director;
    private String genre;
    //    private int date;
    private String date;
//    private Actor actors;

    private List<Actor> actorsInMovieList;

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setActors(Actor actors) {
        this.actors = actors;
    }

    public Movie(String title, Director director, String genre, String date, List<Actor> actorsInMovieList) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.date = date;
        this.actorsInMovieList = new ArrayList<Actor>();
    }


    }

}
