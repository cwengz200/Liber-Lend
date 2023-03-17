package domain;

import static org.junit.jupiter.api.Assertions.*;
/*
    MagazineTest.java
    Class for the MagazineTest
    Author: Peter Buckingham (220165289)
    Date: 17 March 2021
*/
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MagazineTest {

    //private final Author author = new Author("John Doe");
    // private final Publisher publisher = new Publisher("Publishing House");
    // private final Language language = Language.ENGLISH;
    // private final Genre genre = Genre.NEWS;
    private final Date date = new Date();
    private final String imageUrl = "https://example.com/magazine.jpg";

    @Test
    void testMagazineEquals() {
        Magazine magazine1 = new Magazine.MagazineBuilder("Magazine Title")
                .setBarcode("123456789")
                //  .setAuthor(author)
                //  .setPublisher(publisher)
                //   .setLanguage(language)
                //   .setGenre(genre)
                .setEdition(1)
                .setPublicationDate(date)
                .setImageUrl(imageUrl)
                .build();

        Magazine magazine2 = new Magazine.MagazineBuilder("Magazine Title")
                .setBarcode("987654321")
                //  .setAuthor(author)
                //   .setPublisher(publisher)
                //  .setLanguage(language)
                //  .setGenre(genre)
                .setEdition(2)
                .setPublicationDate(date)
                .setImageUrl(imageUrl)
                .build();

        Magazine magazine3 = new Magazine.MagazineBuilder("Magazine Title")
                .setBarcode("123456789")
                //  .setAuthor(author)
                //  .setPublisher(publisher)
                //  .setLanguage(language)
                //  .setGenre(genre)
                .setEdition(1)
                .setPublicationDate(date)
                .setImageUrl(imageUrl)
                .build();

        assertEquals(magazine1, magazine3);
        assertNotEquals(magazine1, magazine2);
    }
}
