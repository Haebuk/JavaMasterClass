import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie theMovie = new Adventure("Star wars");
//        theMovie.watchMovie();

//        Movie theMovie = Movie.getMovie("Science", "Star wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
