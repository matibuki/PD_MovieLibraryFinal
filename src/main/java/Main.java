import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

public class Main {
    public static String readFileAsString(String file) throws Exception {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    public static void main(String[] args) throws Exception {
        String file = "src/main/resources/movies2.json";
        String movieJson = readFileAsString(file);
//        System.out.println(movieJson);


        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(movieJson);
        Utils utils = new Utils();

        System.out.println(utils.extractStringFromJson(););

//        Movie movie = new Movie(extractStringFromJson() +
//                getdirector() +
//                extractStringFromJson() +
//                extractStringFromJson() +
//                extractStringFromJson()
//                );


//        Movie movie = objectMapper.readValue(movieJson, Movie.class);
//        System.out.println(movie.getTitle());

    }

}
