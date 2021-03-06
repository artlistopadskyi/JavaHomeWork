package hw5;

public class Reader {
    private final String fio;
    private final int libraryCardNumber;
    private final String faculty;
    private final String birthday;
    private final String phone;

    public Reader(String fio, int libraryCardNumber, String faculty, String birthday, String phone) {
        this.fio = fio;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }

    public String print() {
        return fio + "(Номер читательского билета: " + libraryCardNumber + ";" +
                " Факультет: " + faculty + ";" +
                " Дата рождения: " + birthday + ";" +
                " Телефон: " + phone +")";
    }

    public String takeBook(int counterBook) {
        return fio + " взял " + counterBook + " книги";
    }

    public String takeBook(String... nameBooks) {
        return fio + " взял книги: " + String.join(", ", nameBooks);
    }

    public String takeBook(Book... books) {
        String result = fio + " взял книги: ";
        result += getPrintBooks(books);
        return result;
    }

    public String returnBook(int counterBook) {
        return fio + " вернул " + counterBook + " книги";
    }

    public String returnBook(String... nameBooks) {
        return fio + " вернул книги: " + String.join(", ", nameBooks);
    }

    public String returnBook(Book... books) {
        String result = fio + " вернул книги: ";
        result += getPrintBooks(books);
        return result;
    }

    private String getPrintBooks(Book... books) {
        StringBuilder result = new StringBuilder();
        int i = 1;
        for (Book book:books) {
            result.append(book.print());
            if (i < books.length) {
                result.append(", ");
            } else {
                result.append(".");
            }
            i++;
        }

        return result.toString();
    }
}
