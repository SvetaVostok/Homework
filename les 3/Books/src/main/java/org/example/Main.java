package org.example;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("", "", "");
        Book book = new Book("", "", null);
        author.setAuthorname("Pushkin");
        author.setAuthorgender("Муж");
        author.setAuthoremail("-");
        book.setBookauthor(author);
        book.setBookyear("1833");
        book.setBooktitle("Евгений Онегин");
        System.out.println(book.toString());
    }
}