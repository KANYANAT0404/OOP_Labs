package lab1;

public class Bookdemo {
    public static void main(String[] args) {
        Book book = new Book ("Developing java Software", "Russel Winder", 79.75);
        System.out.println("Titel: "+book.getTitle());
        System.out.println("Author: "+book.getAuthor());
    }
}
