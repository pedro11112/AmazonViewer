package model;

public class Movie extends Film {

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
        return "Title: el tucu lo mama rico";
    }
    
}
