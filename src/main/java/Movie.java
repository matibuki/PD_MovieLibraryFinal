public class Movie {


    private String title;
    Director director;
    private String genre;
    private int date;
    private Actor actors;

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDate() {
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

    public void setDate(int date) {
        this.date = date;
    }

    public void setActors(Actor actors) {
        this.actors = actors;
    }

    public Movie(String title, Director director, String genre, int date, Actor actors) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.date = date;
        this.actors = actors;
    }

}
