package factory;
/*
    BookFactory.java
    Class for the BookFactory
    Author: Peter Buckingham (220165289)
    Date: 17 March 2021
*/
import domain.Book;

import java.util.ArrayList;
import java.util.List;


public class BookFactory implements Factory<Book> {
    private final List<Book> books;
    private long nextId;

    public BookFactory() {
        books = new ArrayList<>();
        nextId = 1;
    }

    @Override
    public Book create() {
        return new Book.Builder("", null, null, "").build();
    }

    @Override
    public Book getById(long id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book update(Book entity) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == entity.getId()) {
                books.set(i, entity);
                return entity;
            }
        }
        return null;
    }

    @Override
    public boolean delete(Book entity) {
        return books.remove(entity);
    }

    @Override
    public List<Book> getAll() {
        return new ArrayList<>(books);
    }

    @Override
    public long count() {
        return books.size();
    }


    public Book create(Book entity) {
        entity.setId(nextId++);
        books.add(entity);
        return entity;
    }
}