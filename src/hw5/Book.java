package hw5;

public class Book {
    private final String name;
    private final String author;
    private final int yearOfPublishing;

    public Book(String name, String author, int yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String print() {
        return name + " (" + author + " " + yearOfPublishing + " г.)";
    }

    public String getName() {
        return name;
    }
}

