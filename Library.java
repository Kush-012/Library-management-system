import java.util.*;

class Library {

    ArrayList<Book> bookList = new ArrayList<>();
    HashMap<Integer, Book> bookMap = new HashMap<>();

    void addBook(int id, String name, String author) {
        if(bookMap.containsKey(id)) {
            System.out.println("Book ID already exists!");
            return;
        }

        Book b = new Book(id, name, author);
        bookList.add(b);
        bookMap.put(id, b);

        System.out.println("Book Added Successfully!");
    }

    void viewBooks() {
        if(bookList.isEmpty()) {
            System.out.println("Library is empty!");
            return;
        }

        for(Book b : bookList)
            b.display();
    }

    void searchBook(int id) {
        if(bookMap.containsKey(id))
            bookMap.get(id).display();
        else
            System.out.println("Book Not Found!");
    }

    void issueBook(int id) {
        if(bookMap.containsKey(id)) {
            Book b = bookMap.get(id);

            if(!b.isIssued) {
                b.isIssued = true;
                System.out.println("Book Issued!");
            }
            else
                System.out.println("Already Issued!");
        }
        else
            System.out.println("Book Not Found!");
    }

    void returnBook(int id) {
        if(bookMap.containsKey(id)) {
            Book b = bookMap.get(id);

            if(b.isIssued) {
                b.isIssued = false;
                System.out.println("Book Returned!");
            }
            else
                System.out.println("Book was not issued!");
        }
        else
            System.out.println("Book Not Found!");
    }

    void deleteBook(int id) {
        if(bookMap.containsKey(id)) {
            Book b = bookMap.get(id);
            bookList.remove(b);
            bookMap.remove(id);
            System.out.println("Book Deleted!");
        }
        else
            System.out.println("Book Not Found!");
    }
}