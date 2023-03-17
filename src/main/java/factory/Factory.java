package factory;
/*
    factory.java
    Interface for the factory
    Author: Peter Buckingham (220165289)
    Date: 17 March 2021
*/

import java.util.List;

public interface Factory<T> {
    T create();
    T getById(long id);
    T update(T entity);
    boolean delete(T entity);
    List<T> getAll();
    long count();

}