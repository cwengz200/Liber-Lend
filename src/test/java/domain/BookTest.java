package domain;

/*
    BookFactory.java
    Class for the BookTest
    Author: Peter Buckingham (220165289)
    Date: 17 March 2021
*/


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    void testBuilder() {
        //    Author author = new Author("John", "Doe");
        //  Publisher publisher = new Publisher("Penguin", "123 Main St");
        Book book = new Book.Builder("The Catcher in the Rye", null, null, "9780316769488")
                .imageLink("https://www.example.com/catcher.jpg")
                .description("A novel about a teenager named Holden Caulfield")
                //    .genre(Genre.FICTION)
                //    .language(Language.ENGLISH)
                .edition(1)
                .build();
        Assertions.assertEquals("The Catcher in the Rye", book.getTitle());
        //  Assertions.assertEquals(author, book.getAuthor());
        //  Assertions.assertEquals(publisher, book.getPublisher());
        Assertions.assertEquals("9780316769488", book.getISBN());
        Assertions.assertEquals("https://www.example.com/catcher.jpg", book.getImageLink());
        Assertions.assertEquals("A novel about a teenager named Holden Caulfield", book.getDescription());
        //   Assertions.assertEquals(Genre.FICTION, book.getGenre());
        //  Assertions.assertEquals(Language.ENGLISH, book.getLanguage());
        Assertions.assertEquals(1, book.getEdition());
    }

    @Test
    void testEqualsAndHashCode() {
        //    Author author = new Author("Jane", "Doe");
        //  Publisher publisher = new Publisher("HarperCollins", "456 Main St");
        Book book1 = new Book.Builder("To Kill a Mockingbird", null, null, "9780061120084")
                .imageLink("https://www.example.com/mockingbird.jpg")
                .description("A novel about racial injustice in the Deep South")
                //  .genre(Genre.FICTION)
                //  .language(Language.ENGLISH)
                .edition(1)
                .build();
        Book book2 = new Book.Builder("To Kill a Mockingbird", null, null, "9780061120084")
                .imageLink("https://www.example.com/mockingbird.jpg")
                .description("A novel about racial injustice in the Deep South")
                // .genre(Genre.FICTION)
                //  .language(Language.ENGLISH)
                .edition(1)
                .build();
        Book book3 = new Book.Builder("1984", null, null, "9780451524935")
                .imageLink("https://www.example.com/1984.jpg")
                .description("A dystopian novel about a totalitarian society")
                //  .genre(Genre.FICTION)
                // .language(Language.ENGLISH)
                .edition(1)
                .build();
        Assertions.assertEquals(book1, book2);
        Assertions.assertEquals(book1.hashCode(), book2.hashCode());
        Assertions.assertNotEquals(book1, book3);
        Assertions.assertNotEquals(book1.hashCode(), book3.hashCode());
    }
}