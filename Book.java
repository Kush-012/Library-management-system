class Book {
    int id;
    String name;
    String author;
    boolean isIssued;

    Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isIssued = false;
    }

    void display() {
        System.out.println("ID: " + id +
                " | Name: " + name +
                " | Author: " + author +
                " | Issued: " + isIssued);
    }
} 