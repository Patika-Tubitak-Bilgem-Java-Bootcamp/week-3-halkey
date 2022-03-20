package solution;

import java.util.TreeSet;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {



        Book book1 = new Book("Animal Farm", 112, "George Orwell", 1945);
        Book book2 = new Book("The Little Prince", 136, "Antoine de Saint-Exupery", 1943);
        Book book3 = new Book("The Waves", 224, "Virginia Woolf", 1931);
        Book book4 = new Book("Othello", 147, "William Shakespeare",1603);
        Book book5 = new Book("Homage to Catalonia ", 288, "George Orwell",1938);

        TreeSet<Book> bookSetName = new TreeSet<>();

        bookSetName.add(book1);
        bookSetName.add(book2);
        bookSetName.add(book3);
        bookSetName.add(book4);
        bookSetName.add(book5);

        for (Book book:bookSetName) {
            System.out.printf("Book Name: %-23s Page: %4d\n", book.getName(), book.getPageNum());
        }

        System.out.println("======================================");

        TreeSet<Book> bookSetPageNum = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getPageNum() - b2.getPageNum();
            }
        }.reversed());

        bookSetPageNum.add(book1);
        bookSetPageNum.add(book2);
        bookSetPageNum.add(book3);
        bookSetPageNum.add(book4);
        bookSetPageNum.add(book5);

        for (Book book:bookSetPageNum) {
            System.out.printf("Book Name: %-23s Page: %4d\n", book.getName(), book.getPageNum());
        }



    }
}
