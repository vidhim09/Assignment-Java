package ExerciseJava2;

import java.sql.Date;

public abstract class LibraryManagementSystem {
    public String name;
    public String address;
}

class Account extends LibraryManagementSystem implements Fine{
    private int id;
    private Date openedDate;
    private String issuedBooks[];
    private String reservedBook;
    private int fine;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(Date openedDate) {
        this.openedDate = openedDate;
    }

    public String[] getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(String[] issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    public String getReservedBook() {
        return reservedBook;
    }

    public void setReservedBook(String reservedBook) {
        this.reservedBook = reservedBook;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    @Override
    public void calculateFine() {

    }
}

class Book extends Author implements Management,Search{
    private String name;
    private String subject;
    private int price;
    private String author;
    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void issueBook() {

    }

    @Override
    public void returnBook() {

    }

    @Override
    public void sortBook() {

    }

    @Override
    public void searchBook() {

    }
}

class Author{
    private String name;
    private Date DOB;
    private String biography;
}

class Librarian extends LibraryManagementSystem{
    private String name;
    private String address;
    private String position;
}

interface Management{
    public void issueBook();
    public void returnBook();
}

interface Fine{
    public void calculateFine();
}

interface Search extends Management{
    public void sortBook();
    public void searchBook();
}