package model;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Film implements IVisualizable {

    private int id;
    private int timeViewed;

    public Movie(String title, String genre, String creator, int duration, short year) {
        super(title, genre, creator, duration);
        setYear(year);
    }

    public void showData() {
        //   System.out.println("Title: " + title);
        //   System.out.println("Genre: " + genre);
        //   System.out.println("Año: " + year);
    }

    public int getId() {
        return id;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    @Override
    public String toString() {
        return "\n :: MOVIE ::"
                + "\n Title: " + getTitle()
                + "\n Genero: " + getGenre()
                + "\n Year: " + getYear()
                + "\n Creator: " + getCreator()
                + "\n Duration: " + getDuration();
    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if (dateF.getSeconds() > dateI.getSeconds()) {
            setTimeViewed(dateF.getSeconds() - dateI.getSeconds());
        } else {
            setTimeViewed(0);
        }
    }

    public static ArrayList<Movie> makeMoviesList() {
        ArrayList<Movie> movies = new ArrayList();

        for (int i = 0; i <= 5; i++) {
            movies.add(new Movie("Movie 1" + i, "Genero 1" + i, "Creador 1" + i, 120 + i, (short) (2017 + i)));
        }
        return movies;
    }
}
