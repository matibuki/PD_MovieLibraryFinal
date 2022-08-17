import java.util.ArrayList;
import java.util.List;

public class NetflixList {
    private List<Movie>  moviesList;

    public NetflixList() {
        moviesList = new ArrayList<>();
    }

    public void addMovie(Movie newMovie) {
        moviesList.add(newMovie);

    }

}
