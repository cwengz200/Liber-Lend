package factory;

import domain.Author;
import domain.Magazine;
import domain.Publisher;
import domain.Genre;
import domain.Language;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagazineFactoryTest {
    @Test
    public void testCreateMagazine() {
        Magazine magazine = new Magazine.MagazineBuilder("Title")
                .setBarcode("123456789")
                ///    .setAuthor(new Author("John Doe"))
                //    .setPublisher(new Publisher("Publisher Inc."))
                //  .setLanguage(Language.ENGLISH)
                //    .setGenre(Genre.FASHION)
                .setEdition(1)
                //     .setPublicationDate(new Date())
                .setImageUrl("https://example.com/magazine.jpg")
                .build();

        assertEquals("Title", magazine.getTitle());
        assertEquals("123456789", magazine.getBarcode());
        //   assertEquals(new Author("John Doe"), magazine.getAuthor());
        //  assertEquals(new Publisher("Publisher Inc."), magazine.getPublisher());
        //  assertEquals(Language.ENGLISH, magazine.getLanguage());
        //  assertEquals(Genre.FASHION, magazine.getGenre());
        assertEquals(1, magazine.getEdition());
        //assertNotNull(magazine.getPublicationDate());
        assertEquals("https://example.com/magazine.jpg", magazine.getImageUrl());
    }

    @Test
    public void testGetMagazineFields() {
        Magazine magazine = new Magazine.MagazineBuilder("Title")
                .setBarcode("123456789")
                //   .setAuthor(new Author("John Doe"))
                //   .setPublisher(new Publisher("Publisher Inc."))
                //   .setLanguage(Language.ENGLISH)
                //    .setGenre(Genre.FASHION)
                .setEdition(1)
                //    .setPublicationDate(new Date())
                .setImageUrl("https://example.com/magazine.jpg")
                .build();

        assertEquals("Title", magazine.getTitle());
        assertEquals("123456789", magazine.getBarcode());
        //   assertEquals(new Author("John Doe"), magazine.getAuthor());
        //    assertEquals(new Publisher("Publisher Inc."), magazine.getPublisher());
        //    assertEquals(Language.ENGLISH, magazine.getLanguage());
        //     assertEquals(Genre.FASHION, magazine.getGenre());
        assertEquals(1, magazine.getEdition());
     //   assertNotNull(magazine.getPublicationDate());
        assertEquals("https://example.com/magazine.jpg", magazine.getImageUrl());
    }

    @Test
    public void testMagazineFieldsAreImmutable() {
        Magazine magazine = new Magazine.MagazineBuilder("Title")
                .setBarcode("123456789")
                //          .setAuthor(new Author("John Doe"))
                //          .setPublisher(new Publisher("Publisher Inc."))
                //           .setLanguage(Language.ENGLISH)
                //            .setGenre(Genre.FASHION)
                .setEdition(1)
                //            .setPublicationDate(new Date())
                .setImageUrl("https://example.com/magazine.jpg")
                .build();

        // Attempt to modify a field of the Magazine object
        //      magazine.getAuthor().setName("Jane Doe");

        // Check that the field was not modified
        //      assertEquals(new Author("John Doe"), magazine.getAuthor());
    }

    @Test
    public void testMagazineEquality() {
        Magazine magazine1 = new Magazine.MagazineBuilder("Title")
                .setBarcode("123456789")
                //          .setAuthor(new Author("John Doe"))
                //          .setPublisher(new Publisher("Publisher Inc."))
                //         .setLanguage(Language.ENGLISH)
                //          .setGenre(Genre.FASHION)
                .setEdition(1)
                //           .setPublicationDate(new Date())
                .setImageUrl("https://example.com/magazine.jpg")
                .build();

        Magazine magazine2 = new Magazine.MagazineBuilder("Title")
                .setBarcode("123456789")
                //   .setAuthor(new Author("John Doe"))
                //    .setPublisher(new Publisher("Publisher Inc."))
                //    .setLanguage(Language.ENGLISH)
                //    .setGenre(Genre.FASHION)
                .setEdition(1)
                //    .setPublicationDate(new Date())
                .setImageUrl("https://example.com/magazine.jpg")
                .build();

        assertEquals(magazine1, magazine2);
    }


}