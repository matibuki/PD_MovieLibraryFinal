import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

public class Utils {
    private JsonNode jsonNode;
    private List<Actor> actorsInMovieList;


    public Movie addNewMovie() {
        String title = jsonNode.get("movie").get("title").toString();
        Director director = addNewDirector();
        String genre = jsonNode.get("movie").get("genre").toString();
        String date = jsonNode.get("movie").get("date").toString();
        addActorToMovie(addNewActor());
        return new Movie(title, director, genre, date, actorsInMovieList);
    }

    public Actor addNewActor() {
//        String name = getJsonValue();
        JsonNode
        JsonNode array1 = jsonNode.get
        String name = jsonNode.get("movie").get("actors").as;
        String surname = getJsonValue();
        return new Actor(name, surname);
    }

    public void addActorToMovie(Actor actor) {
        actorsInMovieList.add(actor);
    }

    public Director addNewDirector() {
//        String name = getJsonValue();
        String name = jsonNode.get("movie").get("directorName").toString();
//        String surname = getJsonValue();
        String surname = jsonNode.get("movie").get("directorSurname").toString();
        boolean isDirector = true;
        return new Director(name, surname, isDirector);
    }

    public String getJsonValue() {

        return "name"; // TODO
    }
}
