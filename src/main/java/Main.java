import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class Main {
    public static String readFileAsString(String file) throws Exception {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    public static void main(String[] args) throws Exception {
        String file = "src/main/resources/movies.json";
        String movieJson = readFileAsString(file);

        Gson gson = new Gson();
        Type movieListType = new TypeToken<ArrayList<Movie>>() {
        }.getType();

        List<Movie> movieList = gson.fromJson(movieJson, movieListType);

        String menuList = ("""

                Choose what to do:\s

                1 – Please enter two dates to print movies

                2 – Print random movie
                                
                3 – Find actor in movies

                4 – End program""");

        while (true) {
            System.out.println(menuList);
            int menuOption = Utils.getMenuOptionFromUser();
            switch (menuOption) {
                default -> System.out.println(menuList);
                case 1 -> Utils.findMovieBetweenDates(movieList);
                case 2 -> Utils.printRandomMovie(movieList);
                case 3 -> Utils.searchActor(movieList);
                case 4 -> System.exit(0);
            }
        }

    }
}