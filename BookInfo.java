 import java.util.Scanner;

class Book {
    String name;
    String author;
    int price;
    int numpage;

    public Book(String name, String author, int price, int numpage) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numpage = numpage;
    }

    public void setDetails(String name, String author, int price, int numpage) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numpage = numpage;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getPage() {
        return numpage;
    }

    public String toString() {
        String namestr = "Book name: " + this.name + "\n";
        String authorstr = "Author name: " + this.author + "\n";
        String pricestr = "Book price: " + this.price + "\n";
        String numpagestr = "No. of pages: " + this.numpage + "\n";

        return namestr + authorstr + pricestr + numpagestr;
    }
}

public class BookInfo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of books: ");
        int n = s.nextInt();
        s.nextLine();
        
        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Detail for book " + (i + 1));

            System.out.println("Name: ");
            String name = s.nextLine();

            System.out.println("Author: ");
            String author = s.nextLine();

            System.out.println("Price: ");
            int price = s.nextInt();

            System.out.println("No. of pages: ");
            int numPages = s.nextInt();
            s.nextLine();

            books[i] = new Book(name, author, price, numPages);
        }

        System.out.println("Book Details: ");
        for (int i = 0; i < n; i++) {
            System.out.println(books[i].toString());
        }
        s.close();
	System.out.println("Kumud Raj Ghimire (1BM23CS160)");
    }
}