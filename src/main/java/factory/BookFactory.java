package factory;
/*
    BookFactory.java
    Class for the BookFactory
    Author: Peter Buckingham (220165289)
    Date: 17 March 2021
*/
import domain.Book;

import java.util.List;

public class BookFactory implements Factory<Book> {

    @Override
    public Book create() {
        // TODO: Implement create method
        return null;
    }

    @Override
    public Book getById(long id) {
        // TODO: Implement getById method
        return null;
    }

    @Override
    public List<Book> getAll() {
        // TODO: Implement getAll method
        return null;
    }

    @Override
    public Book update(Book entity) {
        // TODO: Implement update method
        return null;
    }

    @Override
    public boolean delete(Book entity) {
        // TODO: Implement delete method
        return false;
    }

    @Override
    public long count() {
        // TODO: Implement count method
        return 0;
    }
}
