abstract class LibraryItem {
    private String title;
    private String itemID;
    private boolean checkedOut;

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
        this.checkedOut = false;
    }

    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println(title + " checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void checkIn() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println(title + " checked in.");
        } else {
            System.out.println(title + " is already checked in.");
        }
    }

    public void displayItemDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemID);
    }
}

class Book extends LibraryItem {
    private String author;
    private int numPages;

    public Book(String title, String itemID, String author, int numPages) {
        super(title, itemID);
        this.author = author;
        this.numPages = numPages;
    }

    public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numPages);
    }
}

class Magazine extends LibraryItem {
    private String issueDate;
    private String publisher;

    public Magazine(String title, String itemID, String issueDate, String publisher) {
        super(title, itemID);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }

    public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Publisher: " + publisher);
    }
}

class LibraryMember {
    private String memberID;
    private String name;

    public LibraryMember(String memberID, String name) {
        this.memberID = memberID;
        this.name = name;
    }

    public void displayMemberDetails() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + name);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create 5 objects of the Book class
        Book book1 = new Book("The Catcher in the Rye", "B001", "J.D. Salinger", 240);
        Book book2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281);
        Book book3 = new Book("1984", "B003", "George Orwell", 328);
        Book book4 = new Book("Pride and Prejudice", "B004", "Jane Austen", 432);
        Book book5 = new Book("The Hobbit", "B005", "J.R.R. Tolkien", 320);

        // Create 5 objects of the Magazine class
        Magazine magazine1 = new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society");
        Magazine magazine2 = new Magazine("Time", "M002", "September 2023", "Time USA, LLC");
        Magazine magazine3 = new Magazine("Forbes", "M003", "June 2023", "Forbes Media");
        Magazine magazine4 = new Magazine("Vogue", "M004", "July 2023", "Condé Nast");
        Magazine magazine5 = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition");

        // Create 5 objects of the LibraryMember class
        LibraryMember member1 = new LibraryMember("L001", "John Doe");
        LibraryMember member2 = new LibraryMember("L002", "Jane Smith");
        LibraryMember member3 = new LibraryMember("L003", "David Johnson");
        LibraryMember member4 = new LibraryMember("L004", "Sarah Williams");
        LibraryMember member5 = new LibraryMember("L005", "Michael Brown");

        // Set the properties of the objects using appropriate setter methods

        // Checking out a book
        book1.checkOut();

        // Checking in the book
        book1.checkIn();

        // Display the details of all the library items and library members
        System.out.println("Library Items:");
        System.out.println("===============");
        book1.displayItemDetails();
        book2.displayItemDetails();
        book3.displayItemDetails();
        book4.displayItemDetails();
        book5.displayItemDetails();
        magazine1.displayItemDetails();
        magazine2.displayItemDetails();
        magazine3.displayItemDetails();
        magazine4.displayItemDetails();
        magazine5.displayItemDetails();

        System.out.println("\nLibrary Members:");
        System.out.println("================");
        member1.displayMemberDetails();
        member2.displayMemberDetails();
        member3.displayMemberDetails();
        member4.displayMemberDetails();
        member5.displayMemberDetails();
    }
}
