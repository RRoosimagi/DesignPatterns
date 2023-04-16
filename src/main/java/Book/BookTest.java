package Book;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Lost in the forest", "Ken Lõvi", 16);
        Book book2 = new Book("Mushroom Walk", "Luise Saarmas", 22);
        Book book3 = new Book("Game of Thrones", " George R. R. Martin", 34);
        Book book4 = new Book("Head First Java", "Sierra & Bates", 65);

        System.out.println("Book 1);
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Title: \"" + book1.getTitle() + "\"");
        System.out.println("Price: " + book1.getPrice()+ " € ");

        System.out.println("Book 2");
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Title: \"" + book2.getTitle() + "\"");
        System.out.println("Price: " + book2.getPrice()+ " € ");

        System.out.println("Book 3");
        System.out.println("Author: " + book3.getAuthor());
        System.out.println("Title: \"" + book3.getTitle() + "\"");
        System.out.println("Price: " + book3.getPrice()+ " € ");

        System.out.println("Book 4");
        System.out.println("Author: " + book4.getAuthor());
        System.out.println("Title: \"" + book4.getTitle() + "\"");
        System.out.println("Price: " + book4.getPrice()+ " € ");
    }
}
