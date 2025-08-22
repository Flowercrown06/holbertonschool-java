

import bookstore.exceptions.InvalidAuthorException;
import bookstore.exceptions.InvalidBookException;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle()  {
       return title;
    }

    public String getAuthor()  {
        return author;
    }

    public double getPrice()   {
        return price;
    }

    public void setTitle(String title)throws InvalidBookException {
        if (title == null || title.trim().length() < 3) {
            throw new InvalidBookException("Invalid book title");
        }
        this.title = title;
    }

    public void setAuthor(String author) throws InvalidAuthorException {
        if (author == null || author.trim().split("\\s+").length < 2) {
            throw new InvalidAuthorException("Invalid author name");
        }
        this.author = author;
    }

    public void setPrice(double price) throws InvalidBookException {
        if(price>=0){
            this.price = price;
        }
        throw new InvalidBookException("Invalid book price");
    }
}
