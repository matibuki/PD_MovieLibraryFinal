import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                                
                3 – Please give actor name and surname

                4 – End program""");

        while (true) {
            System.out.println(menuList);
            int menuOption = getIntFromUser();
            switch (menuOption) {
                default -> System.out.println(menuList);
                case 1 -> System.out.println();
                case 2 -> printRandomMovie(movieList);
//                case 3 -> company.addEmplyoee(helper.getEmployeeFromUser());
                case 4 -> System.exit(0);
            }


        }
    }

    public static int getIntFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printRandomMovie(List<Movie> movieList) {
        int i = 1;
        System.out.println(movieList.get(i).getTitle());
        System.out.println(movieList.get(i).getDirector().getDirectorName() + movieList.get(i).getDirector().getDirectorName());

    }
}