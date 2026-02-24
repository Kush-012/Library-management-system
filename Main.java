import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while(true) {
            System.out.println("\n1.Add Book\n2.View Books\n3.Search Book\n4.Issue Book\n5.Return Book\n6.Delete Book\n7.Exit");

            int ch = sc.nextInt();

            switch(ch) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    lib.addBook(id,name,author);
                    break;

                case 2:
                    lib.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    lib.searchBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    lib.issueBook(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    lib.returnBook(sc.nextInt());
                    break;

                case 6:
                    System.out.print("Enter ID: ");
                    lib.deleteBook(sc.nextInt());
                    break;

                case 7:
                    System.exit(0);
            }
        }
    }
}