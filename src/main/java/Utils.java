import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

public class Utils {
    private JsonNode jsonNode;
    private List<Actor> actorsInMovieList;

    public void extractStringFromJson() {
        Movie newMovie = Movie();

    }

    public Movie addNewMovie() {
        String title = jsonNode.get("movie").get("title").textValue();
        Director director = jsonNode.get("movie").get("directorName").textValue();
        Director director = jsonNode.get("movie").get("directorSurname").textValue();
        String genre = jsonNode.get("movie").get("genre").textValue();
        String date = jsonNode.get("movie").get("date").textValue();


        String actorName = jsonNode.get("movie").get("actors").get("actorName").textValue();
        String actorSurname = jsonNode.get("movie").get("actors").get("actorSurname").textValue();

        return new Movie(title, director, genre, date, actor);
    }

    public Actor addNewActor(Actor actor) {
        String name = getJsonValue();
        String surname = getJsonValue();
        return new Actor(name, surname);
    }

    public void addActorToMovie(Actor actor) {
        actorsInMovieList.add(actor);
    }

    public String getJsonValue() {
        return "name";
    }
}
