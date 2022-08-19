import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;

public class Utils {
    public static void printRandomMovie(List<Movie> movieList) {
        int i = new Random().nextInt(movieList.size());
        System.out.println("Title: " + movieList.get(i).getTitle());
        System.out.println("Director: " + movieList.get(i).getDirector().toString());
        System.out.println("Genre: " + movieList.get(i).getGenre());
        System.out.println("Date: " + movieList.get(i).getDate());
        System.out.println("Actors: ");
        for (Actor a : movieList.get(i).getActors()) {
            System.out.println(a.toString());
        }
    }

    public static int getMenuOptionFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String getStringDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void searchActor(List<Movie> movieList) {
        System.out.println("Please provide actor name and surname");
        String getActorName = getStringDataFromUser();
        for (Movie movie : movieList) {
            for (Actor actor : movie.getActors()) {
                if (Objects.equals(getActorName, actor.toString())) {
                    System.out.println(movie.getTitle());
                }
            }
        }
    }

    public static void findMovieBetweenDates(List<Movie> movieList) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Please provide two dates in format DD-MM-YYYY");
        Date date1 = dateFormat.parse(getStringDataFromUser());
        Date date2 = dateFormat.parse(getStringDataFromUser());
        for (Movie movie : movieList) {
            Date date3 = dateFormat.parse(movie.getDate());
            if ((date1.compareTo(date3) * date3.compareTo(date2)) > 0) {
                System.out.println(movie.getTitle());
            }
        }
    }
}
