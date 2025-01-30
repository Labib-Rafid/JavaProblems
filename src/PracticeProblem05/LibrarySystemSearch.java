package PracticeProblem05;

public class LibrarySystemSearch {
    String tittle, author;
    LibrarySystemSearch(String tittle){
        this(tittle, null);
    }
    LibrarySystemSearch(String tittle, String author){
        this.tittle = tittle;
        this.author = author;
    }
    public static void main(String[] args) {
        LibrarySystemSearch obj1 = new LibrarySystemSearch("Programming With C", "Schaums");
        LibrarySystemSearch obj2 = new LibrarySystemSearch("Java: The Complete Reference");

        System.out.println("Author: " +obj1.author + "\n" + "Book: " + obj1.tittle);
        System.out.println("Author: " +obj2.author + "\n" + "Book: " + obj2.tittle);
    }
}
