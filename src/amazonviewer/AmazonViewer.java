package amazonviewer;

import java.util.Date;
import java.util.Set;
import model.Movie;

public class AmazonViewer {

    public static void showMenu() {
        int exit = 0;
        do {
            System.out.println("BIENVENIDOS A AMAZON VIEWER");
            System.out.println("");
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");

            int response = 1;

            switch (response) {
                case 0:

                    break;
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    makeReport();
                    break;
                case 6:
                    makeReport(new Date());
                    break;

                default:
                    System.out.println();
                    System.out.println("....¡¡Selecciona una opción!!....");
                    System.out.println();
            }
        } while (exit != 0);
    }

    public static void showMovies() {
        int exit = 0;
        do {
            System.out.println();
            System.out.println(":: MOVIES ::");
            System.out.println();
        } while (exit != 0);
    }

    public static void showSeries() {
        int exit = 0;
        do {
            System.out.println();
            System.out.println(":: SERIES ::");
            System.out.println();
        } while (exit != 0);

    }

    public static void showChapters() {
        int exit = 0;
        do {
            System.out.println();
            System.out.println(":: CHAPTERS ::");
            System.out.println();
        } while (exit != 0);
    }

    public static void showBooks() {
        int exit = 0;
        do {
            System.out.println();
            System.out.println(":: BOOKS ::");
            System.out.println();
        } while (exit != 0);
    }

    public static void showMagazines() {
        int exit = 0;
        do {
            System.out.println();
            System.out.println(":: MAGAZINES ::");
            System.out.println();
        } while (exit != 0);
    }

    public static void makeReport() {

    }

    public static void makeReport(Date date) {

    }

    public static void main(String[] args) {
        // TODO auto-Generated code here! 
        /* Movie movie = new Movie("Coco", "Animation", (short) 2017);
        movie.setTitle("Coco");
        movie.showData(); */
        Movie movie = new Movie("Coco", "Animation", "Lee Unkirch", 120, (short) 2017);
        System.out.println(movie);
    }
}
