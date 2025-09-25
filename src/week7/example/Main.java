package week7.example;

public class Main {
    public static void main(String[] args) {
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "");

        //System.out.println(senseAndSensibility);
        //System.out.println(prideAndPrejudice);

        Library library = new Library();
        library.addBook(senseAndSensibility);
        library.addBook(prideAndPrejudice);

        for (Book book : library.bookList()) {
            System.out.println(book);
        }
    }
}
