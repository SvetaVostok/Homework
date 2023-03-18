package org.example;

public class Book {
    private Author author;
    private String year, title;
    public Book(String year, String title, Author author){
        this.year = year;
        this.title = title;
        this.author = author;
    }
    public String getBookyear(){
        return this.year;
    }
    public String getBooktitle(){
        return this.title;
    }
    public Author getBookauthor(){
        return this.author;
    }

    public void setBookyear(String year){
        this.year = year;
    }
    public void setBooktitle(String title){
        this.title = title;
    }
    public void setBookauthor(Author author){
        this.author = author;
    }
    public String toString(){
        System.out.println(this.author.name);
        System.out.println(this.year);
        System.out.println(this.title);
        System.out.println(this.author.gender);
        System.out.println(this.author.email);
        return null;
    }


}