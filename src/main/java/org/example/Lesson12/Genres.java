package org.example.Lesson12;

public class Genres {

    private String title;
    private int id;
    private int popularity;

    public Genres(String title, int id, int popularity) {
        this.title = title;
        this.id = id;
        this.popularity = popularity;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public int getPopularity() {
        return popularity;
    }
    //    public static final String SCI_FI = "Научная фантастика";
//    public static final String ACTION = "Action";
//    public static final String FANTASY = "Фантастика";
//    public static final String COMEDY = "Комедия";

    public static final Genres SCI_FI = new Genres("Научная фантастика", 1, 102154);
    public static final Genres ACTION = new Genres("Action", 2, 158745);
    public static final Genres FANTASY = new Genres("Фантастика", 3, 548711);
    public static final Genres COMEDY = new Genres("Комедия", 4, 245347);


}
