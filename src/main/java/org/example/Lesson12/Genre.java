package org.example.Lesson12;

public enum Genre {

    SCI_FI("Научная фантастика", 1, 102154),
    ACTION("Action", 2, 158745),
    FANTASY("Фантастика", 3, 548711),
    COMEDY("Комедия", 4, 245347);

    private final String title;
    private final int id;
    private final int popularity;

    Genre(String title, int id, int popularity) {
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
}
