package R_OBJECT_ORIENTED_PROGRAMMING;

import java.sql.SQLOutput;

public class Book {
    //Instance Variables
    private String title;
    private String author;
    private String genre;
    private int yearPublished;
    private boolean isAvailable;

    //Constructor
    public Book(String title, String author,String genre,int yearPublished){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.isAvailable = true;

    }

    //Instance method to display book details
    public void displayDetails(){
        System.out.println("Book Title : " + title + ",Author : "
                + author + ",Book Genre :" + genre + ",Publishing year : " + yearPublished + (isAvailable ? "yes" : "No"));
    }
    //Method to borrow a book
    public void borrowBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println(title + "has been successfully borrowed");
        }else{
            System.out.println(title + "is not available for borrowing");
        }
    }
    ////Method to borrow a book
    public void returnBook(){
        if(!isAvailable){
            isAvailable = true;
            System.out.println(title + "has been successfully returned");
        }else {
            System.out.println(title+ "was not borrowed");
        }
    }

    public static void main(String[] args) {

        //Creating book objects
        Book book1 = new Book("1984","George orwell","History", 2022);
        Book book2 = new Book("Atomic Habits" , "James Clear","Self Help", 2020);

        //Displaying book details
        book1.displayDetails();
        book2.displayDetails();

        //Borrow and return operations
        book1.borrowBook();
        book1.displayDetails();//Check status after borrowing

        book1.returnBook();
        book1.displayDetails();// Check status after returning

        book2.borrowBook();
        book2.displayDetails();


    }
}
